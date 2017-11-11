package Textures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class Tile {
	
	private int tileID;
	public static Tile[] passable_tiles = new Tile[100];
	public static Tile[] stone_tiles = new Tile[100];
	
	public static Tile grassTile = new GrassTile(0);
	
	//image of the type of tile to display for the level.
	protected static BufferedImage tileType;
	
	public Tile(BufferedImage bf,int tileID){
		this.tileID = tileID;
	//	Tile.setTile(tileType);
		this.tileType = bf;
	//	passable_tiles[tileID] = this;
	}

public void render(Graphics g, int x, int y){
		g.drawImage(tileType,x,y,64,64,null);
}	

public boolean isSolid(){
	return false;	
}

public int getID(){
	return tileID;
}

public static BufferedImage getTileImage() {
	return tileType;
}

public static void setTile(BufferedImage tileType) {
	Tile.tileType = tileType;
}

}
