package Entity;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Managers.ImageHandler;

public class Player extends Entity {
	
	private BufferedImage wizard;

	public Player(int x, int y) {
		super(x, y);
		
		wizard = ImageHandler.loadImage("Sprites/WizardSprite.png");
		
	}

	@Override
	public void update() {
	
	}

	@Override
	public void render(Graphics g) {
		
		g.drawImage(wizard, xPos, yPos, null);
		
	}

}
