/* 
 * Filename: Sound.java 
 * Created by: Adrianna 
 * Date: May 29th, 2020
 */ 

/**
* Class that represents a sound.  This class is used by the students
* to extend the capabilities of SimpleSound.
*
* Copyright Georgia Institute of Technology 2004
* @author Barbara Ericson ericson@cc.gatech.edu
*/

import java.util.Random;

public class Sound extends SimpleSound {

    /////////////// consructors ////////////////////////////////////

    /**
    * Constructor that takes a file name
    * @param fileName the name of the file to read the sound from
    */
    public Sound(String fileName) {
        // let the parent class handle setting the file name
        super(fileName);
    }

    /**
    * Constructor that takes the number of samples in
    * the sound
    * @param numSamples the number of samples desired
    */
    public Sound (int numSamples) {
        // let the parent class handle this
        super(numSamples);
    }

    /**
    * Constructor that takes the number of samples that this
    * sound will have and the sample rate
    * @param numSamples the number of samples desired
    * @param sampleRate the number of samples per second
    */
    public Sound (int numSamples, int sampleRate) {
        // let the parent class handle this
        super(numSamples,sampleRate);
    }

    /**
    * Constructor that takes a sound to copy
    */
    public Sound (Sound copySound) {
        // let the parent class handle this
        super(copySound);
    }

    ////////////////// methods ////////////////////////////////////

    /**
    * Method to return the string representation of this sound
    * @return a string with information about this sound
    */
    public String toString() {
        String output = "Sound";
        String fileName = getFileName();

        // if there is a file name then add that to the output
        if (fileName != null)
        output = output + " file: " + fileName;

        // add the length in frames
        output = output + " number of samples: " + getLengthInFrames();

        return output;
    }

    /**
    * Method to test whether or not two Sounds are equivalent
    * based on the int values of their SoundSample arrays.
    * @param s the Sound to compare to the calling Sound object
    * @return a boolean representing whether or not the two
    * sounds are equivalent
    */
    public boolean sameSound(Sound s) {
        if (s.getLength() != this.getLength()) {
            return false;
        }
        for (int i = 0; i < s.getLength(); i++) {
            if (s.getSampleValueAt(i) != this.getSampleValueAt(i)) {
                return false;
            }
        }
        return true;
    }

    /**
    * Method to create and return a Sound using an int array.
    * @param arr the int array used to set the values of the
    * SoundSample array of a new Sound to be returned
    * @return a new Sound whose SoundSample array elements are
    * assigned to have the values in the parameter arr
    */
    public static Sound makeSoundFromIntArray(int[] arr) {
        // Optional method to implement
        return null; // replace this return
    }

    /**
    * Method to create and return an int array representation
    * of a Sound.
    * @return an int array whose element values are assigned
    * to have the int values of the calling object's
    * SoundSample array elements
    */
    public int[] getIntArrayFromSound() {
        // Optional method to implement
        return null; // replace this return
    }

   /**
    * This method takes creates a new Sound and implements it with 
    * frequency. It then returns the sound.  
    */
	public static Sound whiteNoise(int frequency, Random rand) {
		
		int arrayLength = (int)(22050.0/frequency);
		
		// Creating new SoundSample Array
		
		Sound s = new Sound(arrayLength); // Setting the array to math
		
		SoundSample [] soundArray = s.getSamples();
		
		for (int i = 0; i < arrayLength; i++)
		{
			// Between -32768 and 32767
			int randomSound = rand.nextInt(32768 + 32787) - 32768;
			soundArray[i].setValue(randomSound);
		
		}
		
		return s;
		
   }

   /**
    * This method will take two Sounds as parameters (first and second).
    * It returns the Sound combining the two. 
    */
    
	public static Sound concatenate(Sound first, Sound second) {
		
		SoundSample [] soundArrayOne = first.getSamples();
		SoundSample [] soundArrayTwo = second.getSamples();
		
		int soundLength = (soundArrayOne.length + soundArrayTwo.length);
		
		Sound result = new Sound(soundLength);
		
		for (int i = 0; i < soundArrayOne.length; i++)
		{
			
			int firstSound = soundArrayOne[i].getValue();
			result.getSamples()[i].setValue(firstSound);
			
		}
		
		for (int i = 0; i < soundArrayTwo.length; i++)
		{
			
			int secondSound = soundArrayTwo[i].getValue();
			result.getSamples()[soundArrayOne.length + i].setValue(secondSound);
		
		}
		
		return result;
		
	}

	/**
    * This method reverses the calling object (this) and returns it. 
    */
    
	public Sound reverse() {
		
		Sound original = new Sound(this);
		
		SoundSample [] originalArray = this.getSamples();
		SoundSample [] copyArray = original.getSamples();
		
		int soundLength = this.getLength();
		
		for (int i = 0; i < soundLength; i++)
		{
		
			int temporarySound = originalArray[soundLength - 1 - i].getValue();
			copyArray[soundLength - 1 - i].setValue(originalArray[i].getValue());
			copyArray[i].setValue(temporarySound);
		
		}
		
		return original;
		
	}

   /**
    * This method returns the new Sound object which reverses the calling
    * object using the methods reverse and concatenate. 
    */ 
    
	public Sound palindrome() {

		// Array for SoundSample 
		
		SoundSample[] samplesArray = this.getSamples();
		
		Sound original = new Sound(this);
		
		Sound reverseSound = this.reverse();
		
		// Length would be twice as long
		Sound palindromeSound = new Sound((samplesArray.length*2));
		
		palindromeSound.concatenate(original, reverseSound);
		
		return palindromeSound; 

	}

}
