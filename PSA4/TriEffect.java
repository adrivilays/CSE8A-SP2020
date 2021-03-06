/* 
 * Filename: Picture.java
 * Created by: Adrianna
 * Date: April 24th, 2020
 * 
 */
 
public class TriEffect {
    //We will learn was this line does later
    public static void main (String[] args) {
		
		Picture original = new Picture
		("/Documents/bookClass/PSA4/bear.jpg");
		
		Picture copy  = new Picture(original);
		
		int i = (copy.getPixels().length/3); // divides the pixels by 3
		// getting the length of the pixels and setting it to int i
		
		original.explore();
		
		// follows in order (x, y) 
		copy.negative(0, i);
		copy.grayscale(i, i*2);
		copy.myFilter(i*2, i*3); 
		
		copy.explore();
		
    }
    
}
