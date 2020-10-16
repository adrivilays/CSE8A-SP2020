/* Filename: RandomTurtleTester.java
 * Created by: Adrianna
 * Date: April 17th, 2020
 * Sources of Help: https://www2.cs.uic.edu/~i101/doc/SimpleTurtle.html
 */

import java.util.Random;
import java.lang.String;

public class RandomTurtleTester {
  //The line below is magic, you don't have to understand it (yet)
	public static void main (String[] args) {
		
		// Part 1.1
		World w = new World(500, 500); 
		Turtle tina = new Turtle(250, 600, w);
		// -1, 1 parameters are passed in for takeStep(int) 
		tina.takeStep(-1);
		tina.takeStep(1);
	  
		// Part 1.2 
		World riverdale = new World(500, 500);
		Turtle archie = new Turtle(250, 450, riverdale);
		Turtle betty = new Turtle(240, 450, riverdale);
		Turtle veronica = new Turtle(230, 450, riverdale);
		Turtle jughead = new Turtle(220, 450, riverdale);
		
		// Creating new Random Object
		Random rando = new Random(); 
		
		// Assigning to integers allows me to print the displacement. 
		int countA = archie.takeNSteps(10, rando);
		int countB = betty.takeNSteps(6, rando);
		int countV = veronica.takeNSteps(5, rando);
		int countJ = jughead.takeNSteps(7, rando);
		
		archie.setName("Archie");
		betty.setName("Betty");
		veronica.setName("Veronica");
		jughead.setName("Jughead"); 
		
		System.out.println("Turtle " + archie.getName() + " took 10 steps and ended in position " + countA); 
		System.out.println("Turtle " + betty.getName() + " took 6 steps and ended in position " + countB); 
		System.out.println("Turtle " + veronica.getName() + " took 5 steps and ended in position " + countV); 
		System.out.println("Turtle " + jughead.getName() + " took 10 steps and ended in position " + countJ); 
		

	}
	
}
