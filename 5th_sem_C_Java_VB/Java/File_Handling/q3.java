/*Write a program to copy contents of one or more files to one output file.
Use command line arguments.
The program should display the size of each input file(s)
and also the size of output file.
javac filename.java
java filename input1.txt input2.txt output.txt*/
import java.io.*;
class q3
{
     public static void main(String args[])throws IOException
     {
         int argc,i,ch;
         int fs[]=new int[50];
         int n;
         argc=args.length;
         FileOutputStream fp2=new FileOutputStream(args[argc-1]);
         n=0;
         for(i=0;i<(argc-1);i++)
         {
              FileInputStream fp1=new FileInputStream(args[i]);
               fs[i]=0;
               while((ch=fp1.read())!=-1)
               {
                   fp2.write(ch);
                   fs[i]=fs[i]+1;
               }
               n=n+fs[i];
               fp1.close();
          }
          fp2.close();
          System.out.println("\nFile Copy is Over...");
           System.out.println("Size of <"+args[argc-1]+"> = "+n+" Bytes");
          for(i=0;i<(argc-1);i++)
               System.out.println("Size of <"+args[i]+"> = "+fs[i]+ " Bytes");
     }
}