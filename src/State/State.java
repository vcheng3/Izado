package State;

import java.awt.Graphics;

import RPG.Game;


public abstract class State {
	
	public Game game;
	private static State currentState = null;

	public State(Game game){
		
		this.game = game;
		
	}
public static State getState(){
	return currentState;
	
}

public static void setState(State state){
	currentState = state;
}
	
public abstract void update();

public abstract void render(Graphics g);
}
