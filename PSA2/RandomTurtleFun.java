/* Filename: RandomTurtleFun.java 
 * Created by: Adrianna 
 * Date: April 10th, 2020
 */ 

import java.util.Random;

public class RandomTurtleFun {
    
    public static void main (String[] args) { 
       
		Random generator = new Random(); 
       
		World world1 = new World(800, 800);
		/**************************************************************/
		
		// Random Positions for the Turtle between 250 and 500.
		int x1 = 250 + generator.nextInt(250); 
		int y1 = 250 + generator.nextInt(250); 
       
		Turtle marge = new Turtle(x1, y1, world1); // turtle object 1
      
		// Random Sizes for the Turtle between 1 and 100.
		// Random Thickness for the Turtle between 1 and 10.
		int randSize = 1 + generator.nextInt(99);
		int randThickness = 1 + generator.nextInt(9);
       
		marge.drawShape(randSize, randThickness);
		
		/**************************************************************/
		
		/**************************************************************/
		
		//Repeating prior steps with 2 new Turtle Objects. SAME variable.
       
		x1 = 250 + generator.nextInt(250);
		y1 = 250 + generator.nextInt(250); 
       
		// Without adding penUp() and penDown() the shapes all connect. 
		marge.penUp(); 

		marge = new Turtle(x1, y1, world1); // turtle object 2
		
		randSize = 1 + generator.nextInt(99);
		randThickness = 1 + generator.nextInt(9);
		
		marge.penDown();
		marge.show();
		marge.drawShape(randSize, randThickness); 
		
		/**************************************************************/
       
		/**************************************************************/
		
		// Repeating prior steps.
       
		x1 = 250 + generator.nextInt(250);
		y1 = 250 + generator.nextInt(250); 
		
		marge.penUp();
		
		marge = new Turtle(x1, y1, world1); // turtle object 3
		
		randSize = 1 + generator.nextInt(99);
		randThickness = 1 + generator.nextInt(9);
		
		marge.penDown();
		marge.show();
		marge.drawShape(randSize, randThickness); 
		
		/**************************************************************/
		
	}
	
} 

