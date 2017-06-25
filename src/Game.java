import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import Entity.Player;

public class Game implements Runnable {
	
	private Thread thread;
	private boolean running = false;
	
	private Display display;
	public String title;
	public int width, height;
	
	private Player player;
	
	public Game(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
	}
	private void init(){
		
	display = new Display(title,width,height);
	player = new Player(50, 50);
	}
	
	private void update(){
		
	}
	
	private void render(){
		BufferStrategy bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		player.render(g);
	
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

}
