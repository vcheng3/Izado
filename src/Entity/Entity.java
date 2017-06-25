package Entity;

import java.awt.Graphics;

public abstract class Entity {
	
	int xPos;
	int yPos;
	
	public Entity(int x, int y){
		this.xPos = x;
		this.yPos = y;
		
	}
public abstract void update();

public abstract void render(Graphics g);

public Entity getEntity() {
	return this;
}

}
