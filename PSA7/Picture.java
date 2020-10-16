/* 
 * Filename: Picture.java
 * Created by: Adrianna
 * Date: May 22nd, 2020
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

   /**
    * Prints the binary representation of the number n to the console
    * n must be non-negative
    * @param int n - the number to convert to binary representation
    */
  public static void printAsBinaryString(int n)
  {
   if (n < 0) {
    System.out.print("Cannot print " + n + " in binary.  Number must be >= 0");
   }
   else {
    String binaryN = "";
    while (n > 1) {
     binaryN = (n%2) + binaryN;
     n = n/2;
    }
    binaryN = n + binaryN;
    while (binaryN.length() < 8) {
     binaryN = "0" + binaryN;
    }
    System.out.print(binaryN);
   }
  }

/**************  PART 1 METHODS *********************/

	/**
	 * Method to return a Picture by creating a copy of the calling object,
	 * and hides a message in that copy via the algorithm.
	 * @param Picture message - hiding the message in the Picture 
	 */
	 
	public Picture hideSecretMessage2Bits(Picture message)
	{
	
		// Make a copy of the calling object and call it canvas
		Picture canvas = new Picture(this.getWidth(), this.getHeight());

		/**
		 * Assume the calling object will always be at least as big as 
		 * the message object you are hiding. 
		 */
		 // For each pixel in the canvas find the corresponding x & y
		 // make sure canvas & message are the same size
		for (int x = 0; x < canvas.getWidth() && x < message.getWidth(); x++)
		{
		
			for (int y = 0; y < canvas.getHeight() && y < message.getHeight(); y++)
			{
				
				Pixel main = this.getPixel(x, y); // CALLING OBJECT - this
				Pixel copy = message.getPixel(x, y);
				Pixel pix_canvas = canvas.getPixel(x, y); 
				/** 
				 * Difference between this & message:
				 * this - copy of the calling object that grabs the message 
				 * and hides it.
				 * message - calling object that is the message
				 */
				
				int red = main.getRed();
				int green = main.getGreen();
				int blue = main.getBlue();
				
				int red2 = copy.getRed();
				int green2 = copy.getGreen();
				int blue2 = copy.getBlue();
				
				/**
				System.out.println("------------" + "\n" + "Red Pixel: " + red2);
				System.out.println("Green Pixel: " + green2);
				System.out.println("Blue Pixel: " + blue2);
				**/
				
				red2 = red2 >> 6;
				green2 = green2 >> 6;
				blue2 = blue2 >> 6;
				
				/**
				System.out.println("\n Red Binary: " + red2);
				System.out.println("Green Binary: " + green2);
				System.out.println("Blue Binary: " + blue2 + "\n" + "------------");
				**/
				
				red = ((red >> 2) << 2) + red2; 
				green = ((green >> 2) << 2) + green2;
				blue = ((blue >> 2) << 2) + blue2; 
				
				pix_canvas.setRed(red);
				pix_canvas.setGreen(green);
				pix_canvas.setBlue(blue); 
				
			}
			
		}
		
		return canvas;
		
	}

	/**
	 * Method that recovers the message by implementing via algorithm.
	 * returns: picture result
	 */

	public Picture recoverSecretMessage2Bits()
	{
		
		Picture result = new Picture(this.getWidth(), this.getHeight());
		
		for (int x = 0; x < this.getWidth() && x < result.getWidth(); x++)
		{
			
			for (int y = 0; y < this.getHeight() && y < result.getHeight(); y++)
			{
			
				Pixel main_pixel = this.getPixel(x, y);
				Pixel result_pixel = result.getPixel(x, y); 
				
				int red = main_pixel.getRed();
				int green = main_pixel.getGreen();
				int blue = main_pixel.getBlue();
				
				red = red % 4; 
				green = green % 4;
				blue = blue % 4; 
				
				red = red << 6; 
				green = green << 6;
				blue = blue << 6;
				
				result_pixel.setRed(red);
				result_pixel.setGreen(green);
				result_pixel.setBlue(blue); 
				
			}	
			
		}	
		return result; 
		
	}

/**************  END OF PART 1 METHODS *********************/

}// this } is the end of class Picture, put all new methods before this
