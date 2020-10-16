/* 
 * Filename: MyCollage.java
 * Created by: Adrianna 
 * Date: May 08th, 2020
 * 
 */

 
public class MyCollage 
{
	public static void main(String[] args) {
		
		Picture canvas = new Picture
		("/Documents/bookClass/PSA5/trees.jpg");
		
		//canvas.show();
		
		Picture copy = new Picture
		("/Documents/bookClass/PSA5/hibiscus.jpg");
		
		Picture copy2 = new Picture
		("/Documents/bookClass/PSA5/pineapple.jpg");
		
		canvas.placePicture(copy, 200, 200);
		canvas.placePicture(copy2, 500, 200); 
		canvas.explore();

	}

}
