package Entity;

import java.awt.Graphics;
import RPG.Game;
import java.awt.image.BufferedImage;

import Managers.ImageHandler;

public class Player extends Entity {
	
	//private BufferedImage wizard;
	private Game game;

	public Player(Game game, int x, int y) {
		super(x, y);
		this.game = game;
		
		
	}

	@Override
	public void update() {
		if(game.getKeyInput().up){
			yPos -= 1;
		}
		if(game.getKeyInput().down){
			yPos += 1;
		}
		if(game.getKeyInput().left){
			xPos -= 1;
		}
		if(game.getKeyInput().right){
			xPos += 1;
		}
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(game.wizard, xPos, yPos, null);
		
	}

}
