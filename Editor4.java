import java.awt.Color;

/**
 * Demonstrates the morphing operation and greScaled featured by Runigram.java. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image and the number of morphing steps (an int).
 * The transforms the colored image into a black and white image.
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		
        Color[][] sourceImage = Runigram.read(source);
		
        Color[][] targetImage = Runigram.read(source);
        targetImage = Runigram.grayScaled(targetImage);

		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}
