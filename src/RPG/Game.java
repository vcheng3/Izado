package RPG;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import State.State;
import State.GameState;
import Input.KeyInput;
import Managers.ImageHandler;

public class Game implements Runnable {
	
	private Thread thread;
	private boolean running = false;
	
	private Display display;
	public String title;
	public int width, height;
	
	public KeyInput keyInput;
	private State gameState;
	public BufferedImage wizard;
	
	public Game(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		keyInput = new KeyInput();
	}
	private void init(){
		
	display = new Display(title,width,height);
	display.getFrame().addKeyListener(keyInput);
	wizard = ImageHandler.loadImage("Sprites/WizardSprite.png");
	gameState = new GameState(this);
	State.setState(gameState);
	}
	
	private void update(){
		keyInput.update();
		//gameState.update();
		wizard = ImageHandler.loadImage("Sprites/WizardSprite.png");
		if(State.getState() != null)
			State.getState().update();
	}
	
	private void render(){	
		BufferStrategy bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);
		//clear screen
		if(State.getState() != null)
			State.getState().render(g);
	
		bs.show();
		g.dispose();
	}
	//automatically called.
	@Override
	public void run() {
		init();
		while(running){
			update();
			render();
			
		}
		
	}
	public synchronized void start(){
		running = true;
		thread = new Thread(this);
		thread.start();
	
	}
	
	public synchronized void stop() throws InterruptedException{
		running = false;
		try{
		thread.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	public KeyInput getKeyInput(){
		return keyInput;
	}

}
