/* 
 * Filename: Chromakey.java
 * Created by: Adrianna
 * Date: May 15th, 2020
 * 
 */

import java.awt.*;

public class Chromakey {
	
	public static void main(String[] args)
	{
	
		Picture original = new Picture
		("/Documents/bookClass/PSA6/Original.png");
		
		Picture background = new Picture
		("/Documents/bookClass/PSA6/Background.png");
		
		Color green = Color.green; 
		
		original.show();
		
		// Finalizing product
		Picture greenScreen = original.replaceAllColor(background, green, 200.0);
		greenScreen.explore(); 
	
	}
	
}
