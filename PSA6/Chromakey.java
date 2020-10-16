/* 
 * Filename: Chromakey.java
 * Created by: Adrianna Vilaysith A14923721
 * Date: May 15th, 2020
 * 
 */

import java.awt.*;

public class Chromakey {
	
	public static void main(String[] args)
	{
	
		Picture original = new Picture
		("/Users/adriannavilaysith/Documents/bookClass/PSA6/Original.png");
		
		Picture background = new Picture
		("/Users/adriannavilaysith/Documents/bookClass/PSA6/Background.png");
		
		Color green = Color.green; 
		
		original.show();
		
		// Finalizing product
		Picture greenScreen = original.replaceAllColor(background, green, 200.0);
		greenScreen.explore(); 
	
	}
	
}
