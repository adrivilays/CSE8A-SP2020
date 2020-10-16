/* Filename: DiceSimulationTester.java
 * Created by: Adrianna 
 * Date: April 16th, 2020 
 * Sources of Help:
 */

import java.util.Random;

public class DiceSimulationTester {
  //The line below is magic, you don't have to understand it (yet)
  
	public static void main (String[] args) {
		
		
		// Creating instances to objects 
		// Allows for separate outputs when running loop 
		DiceSimulation obj = new DiceSimulation();
		DiceSimulation obj2 = new DiceSimulation();
		DiceSimulation obj3 = new DiceSimulation();
		
		Random rando = new Random(); 
		Random rando2 = new Random();
		Random rando3 = new Random();

		System.out.println("Expected Target: 47");
		obj.numRollsNeeded(47, rando); 
		
		System.out.println("Expected Target: 60");		
		obj2.numRollsNeeded(60, rando2); 
		
		System.out.println("Expected Target: 50");	
		obj3.numRollsNeeded(50, rando3);
		
		
	}
  
}
