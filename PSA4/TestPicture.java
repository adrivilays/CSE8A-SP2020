/* 
 * Filename: Picture.java
 * Created by: Adrianna Vilaysith A14923721
 * Date: April 24th, 2020
 * 
 */
 
public class TestPicture {
    //We will learn was this line does later
    public static void main (String[] args){ 
		
		// System.out.println(FileChooser.pickAFile());
		
		Picture original = new Picture
		("/Users/adriannavilaysith/Documents/bookClass/PSA4/bear.jpg");
		
		Picture copy = new Picture(original);
		
		// int i = copy.getPixels().length;
		
		original.explore();
		
		copy.scaleColor(1.12, 1.2, 0.5);
		
		// copy.myFilter(0, i);
		
		copy.explore();
		
	}
    
}
