package Textures;

import java.awt.image.BufferedImage;

import Managers.ImageHandler;

public class GrassTile extends Tile{
	

	public GrassTile(int tileID) {
		super(getTile(), tileID);
		setTile(ImageHandler.loadImage("Sprites/grasstile.png"));
	
	}

}
