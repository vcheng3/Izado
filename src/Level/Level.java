package Level;

import java.awt.Graphics;

import java.awt.image.BufferedImage;

import Textures.Tile;

public class Level {
	
	private int[][] tiles;
	int width = 100,height=100;
	
	Tile tile;

	public Level(){		
		
	}	
	//terrain probably will remain static so this wont be needed.
	public void update(){
		
	}
	//update with actual designed map
	public void render(Graphics g){
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				getTile().render(g, x * 64, y * 64);
			}
		}
	}
	private Tile getTile() {
		return Tile.grassTile;
	}

}
