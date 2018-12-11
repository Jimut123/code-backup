/*Write a Java program to reverse the content one input file.
Write the reverse content in some output file.*/
import java.io.*;
class q12a
{
    public static void main(String args[])throws IOException
    {
        String file1,file2;
        int ch;
        long n,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter Input File Name = ");
        file1=br.readLine();
        System.out.print("\nEnter Output File Name = ");
        file2=br.readLine();
        RandomAccessFile fp1=new RandomAccessFile(file1,"r");
        FileOutputStream fp2=new FileOutputStream(file2);
        n=fp1.length();  //n=size of input file
        //To reverse the content of input file
        for(i=(n-1);i>=0;i--)
        {
            fp1.seek(i);
           ch=fp1.read();
            fp2.write(ch);
          }
        fp1.close();
         fp2.close();
    }
}