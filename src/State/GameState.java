package State;

import java.awt.Graphics;

import Entity.Player;
import Textures.Tile;
import Level.Level;
import RPG.Game;

public class GameState extends State {
	
	private Player player;
	private Level newLevel;
	
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
	}
	
	@Override
	public void update() {
		player.update();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
		//render level
	}

}