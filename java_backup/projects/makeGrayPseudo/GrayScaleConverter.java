/**
 * Create a gray scale version of an image by setting all color components of each pixel to the same value.
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.*;

public class GrayScaleConverter {
	//I started with the image I wanted (inImage)
	public ImageResource makeGray(ImageResource inImage) {
		//I made a blank image of the same size

		//for each pixel in outImage

			//look at the corresponding pixel in inImage

			//compute inPixel's red + inPixel's blue + inPixel's green
			//divide that sum by 3 (call it average)

			//set pixel's red to average

			//set pixel's green to average

			//set pixel's blue to average


		//outImage is your answer
	}

	public void testGray() {
		ImageResource ir = new ImageResource();
		ImageResource gray = makeGray(ir);
		gray.draw();
	}
}
