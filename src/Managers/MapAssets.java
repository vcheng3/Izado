package Managers;

import java.awt.image.BufferedImage;

import Managers.AssetManager;

public class MapAssets implements AssetManager {
	
	public static BufferedImage mainAssets = ImageHandler.loadImage("Sprites/GameSet.png");
	public static BufferedImage grass1,terrain1, stone1, statue1, fountain1;

	private static int width = 32, height = 32;
	

	
	public MapAssets(){
	}

	@Override
	public void init() {
		
		grass1 = mainAssets.getSubimage(width*15, height*9, width, height);
		terrain1 = mainAssets.getSubimage(width*3, height * 35, width, height);
		statue1 = mainAssets.getSubimage(width*22, 0, width, height);
		fountain1 = mainAssets.getSubimage(width*3, 0, width, height);
		stone1 = mainAssets.getSubimage(width*5, height*18, width, height);
	}

}
