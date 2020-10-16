import java.awt.*;

public class ChromakeyTester {
	
	public static void main(String[] args) 
	{
		
		String pic1 = "pic01.png"; // Original picture 
		String pic2 = "galaxy.jpg"; // Background picture 
		
		Color white = Color.white;
		Color green = Color.green; 
		
		Picture original = new Picture(pic1); // Copy of original 
		original.show();
		
		Picture change = new Picture(pic2); // Copy of background 
		
		// Final product 
		Picture greenScreen = original.replaceAllColor(change, green, 200.0);
		greenScreen.show(); 
		
		
		
	}
	
}
