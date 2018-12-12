/*Write a program to remove all comment lines from any Java source program.
The program should also display number of comment lines removed from a program.*/
import java.io.*;
class remc
{
    public static void main(String args[])throws IOException
    {
        int ch,ch1,ch2,ch3;
        long nc,n,i;
       String file1,file2;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("\nEnter Input File Name = ");
       file1=br.readLine();
       System.out.print("Enter Output File Name = ");
       file2=br.readLine();
       RandomAccessFile fp1 = new RandomAccessFile(file1,"r");
       FileOutputStream fp2 = new FileOutputStream(file2);
       n=nc=0;  //n=size of input file
       while((ch=fp1.read())!=-1)
       {
          n++;
          if(ch==34)
          {
             do
             {
                 fp2.write(ch);
                 ch=fp1.read();
                 n++;
              }while(ch !=34);
             fp2.write(ch);
           }
          else if((char)ch=='#')
          {
                  nc++;
                  do
                  {
                      ch1=fp1.read();
                      n++;
                   }while(ch1!=10);
           }
           else
             fp2.write(ch);
          }
          fp1.close();
          fp2.close();
          System.out.println("\nNumber of Comment lines removed = "+nc);
          System.out.println("\n#This is not a comment line");
     }
}