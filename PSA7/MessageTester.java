
public class MessageTester
{
	//The line below is magic, you don't have to understand it (yet)
	public static void main (String[] args) 
	{
    	
    	String original = FileChooser.pickAFile();
    	Picture original_pic = new Picture(original);
    	original_pic.explore();
    	
    	String message = FileChooser.pickAFile();
    	Picture message_pic = new Picture(message);
    	message_pic.explore();
    	
    	Picture messageWpic = original_pic.hideSecretMessage2Bits(message_pic);
    	messageWpic.explore();
    	
    	Picture message1 = messageWpic.recoverSecretMessage2Bits();
    	message1.explore(); 
 
	}

}
