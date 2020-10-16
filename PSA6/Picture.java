/* 
 * Filename: Picture.java
 * Created by: Adrianna
 * Date: May 15th, 2020
 * 
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
public class Picture extends SimplePicture {
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture () {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param width the width of the desired picture
     * @param height the height of the desired picture
     */
    public Picture(int width, int height) {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a
     * copy of that picture
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString() {
         String output = "Picture, filename " + getFileName() +
        " height " + getHeight()
        + " width " + getWidth();
        return output;
    }

    /**
     * public void flipHorizontalRectangle(int x, int y, int width, int height)​
     * 
     * Will flip a rectangle of dimensions width and height in the horizontal 
     * orientation (flip left and right) in the calling object. 
     * ​(y value of the ​Pixel​s remains the same)​.
     * The top leftcorner of this rectangle is defined by ​x​ and ​y​. 
     * 
     * Parameters: int x, int, y, int width, int height
     * x: Coordinate of pixel
     * y: Coordinate of pixel
     * width: Width of rectangle that flips the portion of the photo
     * height: Height of rectangle that flips the portion of the photo
     */
    public void flipHorizontalRectangle(int x, int y, int width, int height) {
		
		// Setting the colors for .setColor()
		Color temporaryColor;
		
		// Defining x, y values for Pixels 
		int limit1 = x;
		int limit2 = x + width - 1; // Flipping within the Picture 
		// Changing the x value within pixel. 
		
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		
		
		// Make sure one pointer is increasing and one is decreasing
		for (int i = x; i < x + (width/2); i++)
		{
			
			for (int j = y; j < y + height; j++)
			{
				
				sourcePixel = this.getPixel(i, j);
				
				int targetX = limit2 - i;
				
				targetPixel = getPixel(targetX, j);
				 
				temporaryColor = sourcePixel.getColor();
				
				sourcePixel.setColor(targetPixel.getColor());
				
				targetPixel.setColor(temporaryColor);
				
				
			}	
			
		}
		
    }

    /**
     * public void flipVerticalRectangle(int x, int y, int width, int height)​
     * 
     * Will flip a rectangle of dimensions width and height in the vertical 
     * orientation (flip up and down) in the calling object. 
     * ​(x position of the ​Pixel​s remains the same)​. 
     * The top leftcorner of this rectangle is defined by x and y.
     * 
     * Parameters: int x, int, y, int width, int height 
     * x: Coordinate of pixel
     * y: Coordinate of pixel
     * width: Width of rectangle that flips the portion of the photo
     * height: Height of rectangle that flips the portion of the photo
     */
    public void flipVerticalRectangle(int x, int y, int width, int height) {
		
		// Setting the colors for .setColor()
		Color temporaryColor;
		
		// Defining x, y values for Pixels 
		int limit1 = y - height + 1; // Flipping within the picture
		int limit2 = y;
		// Changing the y value within Pixel. 
		
		Pixel sourcePixel = null;
		Pixel targetPixel = null;
		
		// Make sure one pointer is increasing and one is decreasing
		for (int i = x; i < width + x; i++)
		{
			
			for (int j = y; j < y + (height/2); j++)
			{
				
				sourcePixel = this.getPixel(i, j);
				
				int targetY = j - limit1;
				
				targetPixel = getPixel(i, targetY);
				
				temporaryColor = sourcePixel.getColor();
				
				sourcePixel.setColor(targetPixel.getColor());
				
				targetPixel.setColor(temporaryColor);
				
			}	
			
		}
		
    }

    /**
     * Parameters: Picture background, Color replaceColor, double tolerance
     * 
     * background​: A ​Picture​ object which is assumed to be the same size 
     * as the calling object.  
     * 
     * replaceColor​: A ​Color​ to use to determine which ​Pixel​s to replace
     * tolerance​: A ​double​ which specifies how close to ​replaceColor​ a ​
     * Pixel​’s ​Color needs to be to be replaced 
     * (i.e. using the ​colorDistance​​method in the ​Pixel​ class;
     * the distance between the ​Color​ of the ​Pixel​ and the ​replaceColor
     * ​​must be ​strictly less than​ ​tolerance​).
     */
    public Picture replaceAllColor(Picture background, Color replaceColor, double tolerance) {
		
		// Initializing Picture 'this" to replace the colors
		Picture copy = new Picture(this);
		
		Pixel sourceImage = null;
		Pixel backgroundImage = null;
		
		// First, create the loop to grab the pixels.
		for (int x = 0; x < this.getWidth(); x++)
		{
			
			for (int y = 0; y < this.getHeight(); y++)
			{
			
				sourceImage = copy.getPixel(x, y);
				
				/** 
				 * Creating if statement:
				 * This is where we input the tolerance parameter,
				 * making sure replaceColor is stricly less than tolerance.
				 * You can set the tolerance to a desired number
				 * However the higher the tolerance, the more that 
				 * replaceColor is diminished. 
				 */
				
				if (sourceImage.colorDistance(replaceColor) < tolerance)
				{
					
					backgroundImage = background.getPixel(x, y);
					
					sourceImage.setColor(backgroundImage.getColor());
					
				}
			
			}
			
		}
		
		return copy;
		
    }
    
    

} // this } is the end of class Picture, put all new methods before this
