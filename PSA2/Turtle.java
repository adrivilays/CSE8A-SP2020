/* Filename: Turtle.java
 * Modified by: Adrianna Vilaysith A14923721
 * Modified by PSA Teams - Fall 2017 & Spring 2019 & Spring 2020
 * Date: April 10th, 2020
 */

import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle {
  ////////////////// constructors ///////////////////////

  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, ModelDisplay modelDisplayer) {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }

  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p) {
    // let the parent constructor handle it
    super(p);
  }

  ////////////////// methods ///////////////////////

  //put your drawShape method here
  /* Method : drawShape 
   * Created by: Adrianna Vilaysith A14923721
   * Date: April 10th, 2020
   */ 
   
	public void drawShape(int size, int thickness) { 
		
		this.setPenWidth(thickness);
	
		this.turn(45);
		this.forward(size * 3);
		this.forward(size / 2);
		this.turn(-45);
		this.forward(size);
		this.turn(-45);
		this.forward(size);
		this.turn(-45);
		this.forward(size);
		this.turn(-45);
		this.forward(size);
    
		this.turn(90);
		this.forward(size);
		this.turn(-45);
		this.forward(size);
		this.turn(-45);
		this.forward(size);
		this.turn(-45);
		this.forward(size);
		this.turn(-45);
		this.forward(size * 3);
		this.forward(size / 2);

	}

}
