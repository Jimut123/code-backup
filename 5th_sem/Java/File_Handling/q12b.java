/*Write a program to split the content of one input file to multiple output files.
Use command line arguments.
javac filename.java
java filename input.txt output1.txt output2.txt*/
import java.io.*;
class q12b
{
    public static void main(String args[])throws IOException
    {
        int argc,i,j;
        long n,n1,n2,k;
        int ch;
        RandomAccessFile fp1=new RandomAccessFile(args[0],"r");
        n=fp1.length();   //To get size of input file
        argc=args.length;  //argc=number of arguments in command line
        n1=n/(argc-1);  //n1=average size of each output file
        n2=n-n1*(argc-2);  //n2=size of last output file
        for(i=1;i<argc;i++)
        {
            FileOutputStream fp2=new FileOutputStream(args[i]);
            if(i!=(argc-1))
              k=n1;
            else
               k=n2;
            for(j=0;j<k;j++)
            {
               ch=fp1.read();
               fp2.write(ch);
             }
             fp2.close();
        }
        fp1.close();
        System.out.println("Size of <"+args[0]+" > = "+n+" Bytes");
         for(i=1;i<argc;i++)
         {
             if(i!=(argc-1))
               k=n1;
              else
                 k=n2;
              System.out.println("Size of <"+args[i]+" > = "+k+" Bytes");
          }
    }
}