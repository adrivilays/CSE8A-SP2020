/* 
 * Filename: HideSecretMessage.java
 * Created by: Adrianna Vilaysith A14923721
 * Date: May 22nd, 2020
 * 
 */
 
public class HideSecretMessage extends Picture
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
	{
		
		String contextPic = FileChooser.pickAFile();
		Picture context = new Picture(contextPic);
		context.explore();
		
		String messagePic = FileChooser.pickAFile();
		Picture message = new Picture(messagePic);
		message.explore();
		
		Picture revealPic = context.hideSecretMessage2Bits(message);
		revealPic.explore();
		revealPic.write("/Users/adriannavilaysith/Documents/revealpic.bmp");
		
		Picture officialPic = revealPic.recoverSecretMessage2Bits();
		officialPic.explore();
		officialPic.write("/Users/adriannavilaysith/Documents/officialpic.bmp");
		
	}
   
}
