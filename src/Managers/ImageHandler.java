package Managers;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageHandler {
	
	public ImageHandler(){
		
		
	}
	
	public static BufferedImage loadImage(String filepath){
		BufferedImage img = null;
		try{
			img = ImageIO.read(new File(filepath));
			return img;
		}
		catch(IOException e){
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}

}
