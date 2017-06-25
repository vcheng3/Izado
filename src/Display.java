import javax.swing.JFrame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

public class Display {
	
	private Canvas canvas;
	private JFrame frame;
	private String title;
	private int width, height;
	
public Display(String title, int height, int width){
	this.title = title;
	this.width = width;
	this.height = height;
	
	frame = new JFrame(title);
	frame.setSize(width,height);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	
	canvas = new Canvas();
	canvas.setPreferredSize(new Dimension(width,height));
	canvas.setMaximumSize(new Dimension(width,height));
	canvas.setMinimumSize(new Dimension(width,height));
	canvas.setBackground(Color.BLACK);
	frame.add(canvas);
	frame.pack();

}
public Canvas getCanvas(){
	return this.canvas;
}
}
