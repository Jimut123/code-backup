
/**
 * Write a description of ff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;
public class HelloWorld {
    public void runHello()
    {
        FileResource hello = new FileResource("hello_unicode.txt");
        for(String line : hello.lines())
        {
            System.out.println(line);
        }
    }
    public static void main(String args[])
    {
        HelloWorld hw = new HelloWorld();
        hw.runHello();
    }
}
