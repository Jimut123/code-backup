
/**
 * Write a description of ki here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class ImageSaver {
    public void doSave()
    {
        DirectoryResource dr = new DirectoryResource();
        for(File f:dr.selectedFiles())
        {
            ImageResource image = new ImageResource(f);
            String fname = image.getFileName();
            String newName= "copy-"+fname;
            image.setFileName(newName);
            image.draw();
            image.save();
            
        }
    }

}
