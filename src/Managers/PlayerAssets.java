package Managers;

import java.awt.image.BufferedImage;

import Managers.AssetManager;

public class PlayerAssets implements AssetManager {
	
	public static BufferedImage playerAssets = ImageHandler.loadImage("Sprites/wizardsprites.png");
	public static BufferedImage[] player_up, player_down, player_left, player_right;
	
	private static int width = 64, height = 64;

	@Override
	public void init() {
		

/* Walking Animations
 * Default direction animation needs to be set in Animations class and input class.
 */
		
		//fill the up animation
		for(int i = 0; i < 9; i++){
			player_up[i] = playerAssets.getSubimage(width*i, height*8, width, height);
		}
		
		//fill the left animation
		for(int i = 0; i < 9; i++){
			player_left[i] = playerAssets.getSubimage(width*i, height*9, width, height);		
		}
		
		//fill the down animation
		for(int i = 0; i < 9; i++){
			player_down[i] = playerAssets.getSubimage(width*i, height*10, width, height);				
		}
		
		//fill the right animation
		for(int i = 0; i < 9; i++){
			player_right[i] = playerAssets.getSubimage(width*i, height*11, width, height);						
		}
		
	}
}
