/* Filename: DiceSimulation.java
 * Created by: Adrianna Vilaysith A14923721
 * Date: April 17th, 2020 
 * Sources of help:
 */

import java.util.Random;

public class DiceSimulation {
	/* TODO : ADD METHOD HEADER
	 * Look at example method headers in Turtle.java
	 * Program Name: DiceSimulation.java
	 * Description: A program that stimulates a single 20-sided
	 * fair die by using one number and generating the Random
	 * object parameter by calling a nextInt method. 
	 */
	  
	public int numRollsNeeded(int target, Random rand) {
		// Write your code here
		
		int rolls = 0; // Start of the loop 
		int totalRolls = 0; // How many rolls until it reaches < target
		
		while (rolls <= target) {
			
			int die = rand.nextInt(20); // 20 sided fair die 
			// Generates numbers from 1 - 20
			die = die + 1; 
			System.out.println(die); // Print the value of the roll 
			
			rolls += die; 
			
			totalRolls++;
			
		
		}	
		
		System.out.println("--------------");
		
		System.out.println("Total Number of Rolls: " + totalRolls); // Printing the sum 
		
		System.out.println("Actual Target Value: " + rolls);
		
		System.out.println(" "); 
		 
		return totalRolls; // XXX - CHANGE THIS RETURN VALUE TO RETURN THE TOTAL NUMBER
					//OF ROLLS THAT WERE NEEDED TO EXCEED THE TARGET - XXX
					
					
	}

}
