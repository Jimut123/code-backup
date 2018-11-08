//writing data into a file
import java.io.*;
class FileOutputDemo
{
   public static void main(String args[])
   {
       FileOutputStream out;
       PrintStream p;
       try
       {
           out=new FileOutputStream("myfile.txt");
           p=new PrintStream(out);
           p.println("sayantani ghosh");
           p.close();
        }
        catch(Exception e)
         {
             System.out.println("error occured while writing to file");
            }
        }
    }
         