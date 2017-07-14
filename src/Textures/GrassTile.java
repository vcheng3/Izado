package Textures;

import java.awt.image.BufferedImage;

import Managers.ImageHandler;

public class GrassTile extends Tile{
	

	public GrassTile(int tileID) {
		super(getTileImage(), tileID);
	
	
	}

	public static BufferedImage getTileImage() {
		BufferedImage bf;
		return bf = ImageHandler.loadImage("Sprites/grasstile.png");
	}
}
