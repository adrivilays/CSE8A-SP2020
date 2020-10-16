/* 
 * Filename: PictureTester.java
 * Created by: Adrianna 
 * Date: May 08th, 2020
 * 
 */
 
public class PictureTester 
{
	public static void main(String[] args) {
	
		/**
		Picture canvas = new Picture
		("/Documents/bookClass/PSA5/trees.jpg");
		
		//canvas.show();
		
		Picture copy = new Picture
		("/Documents/bookClass/PSA5/hibiscus.jpg");
		
		canvas.placePicture(copy, 200, 200);
		canvas.explore();
		**/
		
		Picture pic1 = new Picture
		("/Documents/bookClass/PSA5/collage1.jpg");
		//pic1.show();
		
		Picture pic2 = new Picture
		("/Documents/bookClass/PSA5/collage2.jpg");
		//pic2.show();
		
		Picture pic3 = new Picture
		("/Documents/bookClass/PSA5/collage3.jpg");
		//pic3.show();
		
		Picture [] pictures = new Picture[]{pic1, pic2, pic3};

		Picture background = new Picture
		("/Documents/bookClass/PSA5/background.jpg");
		
		Picture canvas = new Picture(background.getWidth()*3, background.getHeight()*3);
		
		canvas.collage(pictures);
		
		canvas.explore();
		
		

		
	}

}
