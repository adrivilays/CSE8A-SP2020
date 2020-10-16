/* Filename: Turtle.java
 * Created by: Adrianna 
 * Date: April 17th, 2020
 * Sources of help:
 */

import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 * <p>
 * Copyright Georgia Institute of Technology 2004
 *
 * @author Barb Ericson ericson@cc.gatech.edu
 *         <p>
 *         <p>
 *         Filename: Turtle.java
 *         Created by: Connie Guan cs8a19, Shuaiqi Xia, cs8a1 and Tony Xia, cs8a2
 *         Date: April 13, 2019
 */

public class Turtle extends SimpleTurtle {
  ////////////////// constructors ///////////////////////

  /**
   * Constructor that takes the x and y and a picture to
   * draw on
   *
   * @param x       the starting x position
   * @param y       the starting y position
   * @param picture the picture to draw on
   */
  public Turtle(int x, int y, Picture picture) {
    // let the parent constructor handle it
    super(x, y, picture);
  }

  /**
   * Constructor that takes the x and y and a model
   * display to draw it on
   *
   * @param x              the starting x position
   * @param y              the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle(int x, int y,
      ModelDisplay modelDisplayer) {
    // let the parent constructor handle it
    super(x, y, modelDisplayer);
  }

  /**
   * Constructor that takes the model display
   *
   * @param modelDisplay the thing that displays the model
   */
  public Turtle(ModelDisplay modelDisplay) {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /**
   * Constructor that takes a picture to draw on
   *
   * @param p the picture to draw on
   */
  public Turtle(Picture p) {
    // let the parent constructor handle it
    super(p);
  }

  /////////////////// methods ///////////////////////
  /// ADD YOUR METHODS BELOW THIS LINE AND BEFORE THE } THAT
  //  ENDS THE CLASS
/**
 * Return whether or not the turtle should take a step to the left (-1)
 * or the right (+1)
 * Returns: -1 to represent a step to the left, 1 to represent a
 * step to the right.
 */
public int getRandomDirection(Random numGenerator) {
  // You won't need to change this, but if you wanted to
  // bias your Turtle one direction or the other, you could
  // change this variable to any value between 0 (always goes right)
  // and 1 (always goes left)
  double probabilityToLeft = 0.5;
  // Choose either 0 or 1 (note that next int is NON inclusive
  // of its argument).
  double choice = numGenerator.nextDouble();
  if (choice < probabilityToLeft) {
    return -1;
  } else {
    return 1;
  }
}

/**
 * Turns 45 degrees either to the left or right depending on direction
 * and takes a step in this direction, then turning 45 degree so that it
 * is facing the same way it started.
 * @param direction TODO add description here
 * @return void
 */
public void takeStep(int direction) {
	// TODO: implement method
	
	int x; 
	/**
	 * This is the first step. I am going to multiply x by 45 so
	 * I can input this into the turn method. 
	 */
	
	// Turning 45 degrees I am going to multiply direction by 45
	x = (direction*45);
	// x will be the standard start of how the turtle should turn. 
	
	this.turn(x);
	this.forward(50); // Moving forward 50 3
	this.turn(-x); // Ending in a negative to face originally. 
}

/**
 * Takes a step in in the direction returned by getRandomDirection
 *  and repeats this N times
 * @param nSteps TODO add description here
 * @param rand TODO add description here
 * @return the displacement after taking nSteps
 */
public int takeNSteps(int nSteps, Random rand) {
		// TODO: implement method
	
		int total = 0; // Starting here for beginning direction and returning
		int i; // This is for the for loop 

		for (i = 0; i < nSteps; i++)
		{
		
			// The first step calling getRandomDirection(rand);
			int y = this.getRandomDirection(rand); 
			// Passing random direction into method takeStep
			this.takeStep(y); 
		
			total = y + total; 
		
		}	
		
		return total; //XXX-CHANGE-XXX
		
	}

} // this } is the end of class Turtle, put all new methods before this
