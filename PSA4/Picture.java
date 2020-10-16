/* 
 * Filename: Picture.java
 * Created by: Adrianna
 * Date: April 24th, 2020
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
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public Picture() {
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
  *  Ensure the value is between 0 and 255.  If it is, return it.
  *  If it is less than 0, return 0.  If it is greater than 255,
  *  return 255.
  */
  public int putInColorRange(int value) {
     value = Math.max(value, 0);  // get the max of 0 and the value
     value = Math.min(value, 255);  // get the min of value and 255
     return value;
  }

   /*
    * DESCRIPTION:
    * Method takes in parameters to scale RGB strictly from 0 - 255.
    * Changes the color of the picture, also rounding if parameters
    * are out of bound.
    * 
    * Input: int start - the index of the first pixel.
    * Input: int end - the index of the last pixel. 
    * Returns: nothing
    */
    public void scaleColor(double rScale, double gScale, double bScale) {
		
		// grabbing the Pixel array
		Pixel [] pArray = this.getPixels(); 
		Pixel pixel = null; 
		
		// for loop through all the pixels
		for (int i = 0; i < pArray.length; i++)
		{
			pixel = pArray[i]; 
			
			int newRed = pixel.getRed();
			
			int redValue = (int) (newRed * rScale); // casting
			
			int valueRed = this.putInColorRange(redValue); // method
			
			pixel.setRed(valueRed);
			
			
			int newGreen = pixel.getGreen();
			
			int greenValue = (int) (newGreen * gScale); // casting
			
			int valueGreen = this.putInColorRange(greenValue); // method
			
			pixel.setGreen(valueGreen);
			
			
			int newBlue = pixel.getBlue();
			
			int blueValue = (int) (newBlue * bScale); // casting
			
			int valueBlue = this.putInColorRange(blueValue); // method
			
			pixel.setBlue(valueBlue);
			
			/**
			System.out.println(redValue + ", " + greenValue + ", " 
														+ blueValue);
			**/
			
		}	// end of for loop 
	
    }


    /*
     * DESCRIPTION:
     * Takes the values of RGB and subtracts it from 255 to make the 
     * picture negative.
     *  
     * Input: int start - the index of the first pixel.
     * Input: int end - the index of the last pixel. 
     * Returns: nothing
     */
    public void negative(int start, int end) {
		
		// grabbing the Pixel array
		Pixel [] pixArray = this.getPixels(); 
		Pixel pix = null;
		
		int color1 = 0;
		int color2 = 0;
		int color3 = 0;
		
		// end = pixArray.length; // allowing all pixels to be reached 
		
		// for loop through all the pixels
		// setting i for the for loop 
		for (int i = start; i < end; i++)
		{
			
			pix = pixArray[i];
			
			color1 = pix.getRed();
			color1 = 255 - color1;
			pix.setRed(color1);
			
			color2 = pix.getGreen();
			color2 = 255 - color2;
			pix.setGreen(color2);
			
			color3 = pix.getBlue();
			color3 = 255 - color3;
			pix.setBlue(color3);
			
		}	// end of for loop 
		
    }

    /*
     * DESCRIPTION:
     * Adds all color values together and divide by 3 for a gray image.
     * Uses a for loop to loop through all the pixels.
     * 
     * Input: int start - the index of the first pixel.
     * Input: int end - the index of the last pixel. 
     * Returns: nothing
     */
    public void grayscale(int start, int end) {
		
		// grabbing the Pixel Array
		Pixel [] pixelArray = this.getPixels();
		Pixel pixar = null;
		int sum = 0;
		
		 
		// end = pixelArray.length; // allowing all pixels to be reached 
		
		// for loop through all the pixels
		// setting i for the for loop
		for (int i = start; i < end; i++)
		{
		
			pixar = pixelArray[i]; 
			
			sum = (pixar.getRed() + pixar.getBlue() 
									+ pixar.getGreen())/3;
			pixar.setRed(sum);
			pixar.setGreen(sum);
			pixar.setBlue(sum);
			
		} // end of for loop 
		
    }


    /*
     * DESCRIPTION:
     * myFilter applies to each pixel and swaps the color of each pixel.
     * The red value swaps for the blue value.
     * The green value swaps for the red value.
     * The blue value swaps for the green value.
     * 
     * Input: int start - the index of the first pixel.
     * Input: int end - the index of the last pixel.
     * Returns: nothing 
     */
    public void myFilter(int start, int end) {
		
		// grabbing the Pixel Array
		Pixel [] pixyArray = this.getPixels();
		Pixel pixie = null;
		 
		// end = pixyArray.length; // allowing all pixels to be reached 
		
		// for loop through all the pixels
		// setting i for the for loop
		for (int i = start; i < end; i++)
		{
			
			pixie = pixyArray[i];
			
			int red = pixie.getRed();
			int green = pixie.getGreen();
			int blue = pixie.getBlue();
			
			pixie.setColor(new Color(blue, red, green)); 
			
		} // end of for loop
		
    }

}
