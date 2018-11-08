/**
 * Print the names of all files selected within a directory (or folder).
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import java.io.File;

public class DirReader {
    public void checkDir() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }
}
