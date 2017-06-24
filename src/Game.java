public class Game implements Runnable {
	
	private Thread thread;
	private boolean running = false;
	
	private Display display;
	public String title;
	public int width, height;
	
	public Game(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
	}
	private void init(){
		
	display = new Display(title,width,height);
	}
	
	private void update(){
		
	}
	
	private void render(){
		
	}

	@Override
	public void run() {
		init();
		while(running){
			
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
