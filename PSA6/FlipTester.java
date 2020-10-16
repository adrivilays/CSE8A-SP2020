import java.awt.*;

public class FlipTester {
    public static void main(String[] args){
		
		/**
		String pathName = FileChooser.pickAFile();
		System.out.println(pathName); 
		**/
		
		Picture pic1 = new Picture 
		("/bookClass/PSA6/candy.jpg");
		pic1.explore();
		
		Picture copy1 = new Picture(pic1);
		//Picture copy2 = new Picture(pic1);
		
		copy1.flipVerticalRectangle(395, 38, 500, 100);
		//copy2.flipHorizontalRectangle(0, 1, 500, 100);
		
		copy1.explore();
		//copy2.explore();
		
		
		

    }
}
