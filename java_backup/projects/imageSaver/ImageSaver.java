/**
 * Make copies of all images selected within a directory (or folder).
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.File;

public class ImageSaver {
	public void doSave() {
		DirectoryResource dr = new DirectoryResource();
		for (File f : dr.selectedFiles()) {
			ImageResource image = new ImageResource(f);
			String fname = image.getFileName();
			String newName = "copy-" + fname;
			image.setFileName(newName);
			image.draw();
			image.save();
		}
	}
}
