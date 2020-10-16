/* Filename: CreateShapes.java 
 * Created by: Adrianna
 * Date: April 10th, 2020
 */ 

import java.awt.Color;

public class CreateShapes {
    
    public static void main (String[] args) { 

		World w = new World(900, 900);
        
		Turtle homer = new Turtle(500, 500, w);
		homer.setColor(Color.YELLOW);
		homer.setPenColor(Color.YELLOW);
		homer.drawShape(100, 10);
        
		/* penUp() & penDown() allows the shapes to be separate.
		 * The moveTo() allows for nicer-looking nesting.
		 * drawShape() parameters are int size, int thickness. 
		 */
  
		Turtle bart = new Turtle(500, 500, w);
		bart.setColor(Color.RED);
		bart.setPenColor(Color.RED);
		bart.penUp();
		bart.moveTo(500, 357);
		bart.penDown();
		bart.drawShape(40, 15);
        
		Turtle lisa = new Turtle(500, 500, w);
		lisa.setColor(Color.PINK);
		lisa.setPenColor(Color.PINK);
		lisa.penUp();
		lisa.moveTo(500, 430);
		lisa.penDown();
		lisa.drawShape(70, 4);
        
		Turtle maggie = new Turtle(500, 500, w);
		maggie.setColor(Color.BLUE);
		maggie.setPenColor(Color.BLUE);
		maggie.penUp();
		maggie.moveTo(500, 315);
		maggie.penDown();
		maggie.drawShape(20, 2);

	} 
   
}

