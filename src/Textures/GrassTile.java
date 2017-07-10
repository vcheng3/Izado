package Textures;

import java.awt.image.BufferedImage;

import Managers.ImageHandler;

public class GrassTile extends Tile{
	

	public GrassTile(int tileID) {
		super(getTileImage(), tileID);
	
	
	}

	public static BufferedImage getTileImage() {
		return Tile.tileType = ImageHandler.loadImage("Sprites/grasstile.png");
	}

}
