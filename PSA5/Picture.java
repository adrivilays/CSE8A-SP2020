/* 
 * Filename: Picture.java
 * Created by: Adrianna Vilaysith A14923721
 * Date: May 08th, 2020
 * 
 */
 
 
/*--------PROGRAM DESCRIPTION----------
goes here

*/

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
* A class that represents a picture.  This class inherits from
* SimplePicture and allows the student to add functionality to
* the Picture class.
*
* Copyright Georgia Institute of Technology 2004-2005
* @author Barbara Ericson ericson@cc.gatech.edu
*/
public class Picture extends SimplePicture
{
	///////////////////// constructors //////////////////////////////////

	/**
	* Constructor that takes no arguments
	*/
	public Picture ()
	{
		/* not needed but use it to show students the implicit call to super()
		* child constructors always call a parent constructor
		*/
		super();
	}

	/**
	* Constructor that takes a file name and creates the picture
	* @param fileName the name of the file to create the picture from
	*/
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	* Constructor that takes the width and height
	* @param width the width of the desired picture
	* @param height the height of the desired picture
	*/
	public Picture(int width, int height)
	{
		// let the parent class handle this width and height
		super(width,height);
	}

	/**
	* Constructor that takes a picture and creates a
	* copy of that picture
	*/
	public Picture(Picture copyPicture)
	{
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	* Constructor that takes a buffered image
	* @param image the buffered image to use
	*/
	public Picture(BufferedImage image)
	{
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	* Method to return a string with information about this picture.
	* @return a string with information about the picture such as fileName,
	* height and width.
	*/
	public String toString()
	{
		String output = "Picture, filename " + getFileName() +
		" height " + getHeight()
		+ " width " + getWidth();
		return output;

	}

	/**************  PART 1 METHODS *********************/

	/* This method copies a ​Picture​ object parameter ​pic​ into the 
	 * calling object, starting from pixel position (x, y) of the 
	 * calling object. If the ​Picture​ object passed in is too large to 
	 * fit in the calling object, simply copy the part that will fit 
	 * and ignore the rest. Test the method in Picture.java. */
	 
	public void placePicture(Picture pic, int x, int y)
	{
		
		Pixel source = null;
		Pixel target = null;
		 
		// Looping through columns
		
		for (int sourceY = 0, targetY = y; sourceY < pic.getHeight();
				sourceY++, targetY++)
		{
			// Looping through rows
			
			
		}	
		// Printing out the passed in values
		//System.out.println("Copy coordinates: " + x + ", " + y);
		
	}


	/* Takes an array of Picture objects and copies them into the 
	 * calling object, ordered horizontally,from left to right.  */
	 
	public void collage(Picture [] pictures)
	{
		
		//Pixel sourcePixel = null;
		//Pixel targetPixel = null;
		//Picture copy = new Picture(this);
		//Picture place = new Picture(this);
		int targetX = 0;
		
		
		
		// Loops three times
		for(int i = 0; i < pictures.length; i++)
		{
			int height = pictures[i].getHeight();
			int width = pictures[i].getWidth();
			
			for (int y = 0; y < height; y++)
			{
				
				for (int x = 0; x < width; x++)
				{
					
					targetX = (i * width) + x;
					this.placePicture(pictures[i], targetX, y); 
					
				} 
			 
			}
			
		}
		
	}
	
	public void question14()
	{
		
		
		Pixel [] pixelArray = this.getPixels();
		Pixel q;
		Pixel p;
		for (int index = 0; index < pixelArray.length; index++)
		{
			
			p = pixelArray[index];
			q = pixelArray[index + 1];
			p.setRed(q.getRed());
			p.setBlue(q.getRed());
			p.setGreen(q.getRed());
		
			
		}	
		
		
	}	

} // this } is the end of class Picture, put all new methods before this
