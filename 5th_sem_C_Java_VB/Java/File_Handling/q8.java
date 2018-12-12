/*Write a Java program to input any file name.
Convert the content of the file into bits ( 0 and 1).
Write the bits in one output file.
Read two bits at a time and convert into DNA sequence as follows: A=00, C=01, T=10 and G=11.
Write DNA sequence in another output file. Display size of bit file and also DNA file.*/
import java.io.*;
class q8
{
    public static void main(String args[])throws IOException
    {
        String file1,file2,file3;
        int mask,i,x,k,n1,n2,s1=0,s2=0;
        int ch;
        int bit[]=new int[8];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter Input File Name = ");  
        file1=br.readLine();
        System.out.print("Enter Output File Name = ");
        file2=br.readLine();
        System.out.print("Enter Output File Name = ");
        file3=br.readLine();
        RandomAccessFile fp1 = new RandomAccessFile(file1,"r");
        FileOutputStream fp2=new FileOutputStream(file2);
        FileOutputStream fp3=new FileOutputStream(file3);
        while((ch=fp1.read())!=-1)
        {
             mask=128;
              i=7;
             x=(int)ch;
             while(mask>0)
             {
                 k=x & mask;
                 if(k!=0)
                   bit[i]=1;
                 else
                    bit[i]=0;
                  i--;
                 mask=mask>>1;
              }
              for(int j=7;j>=0;j--)
              {
                   ++s1;
                   fp2.write(bit[j]+48);
              }
             ++s1;
             fp2.write(' ');
              for(int j=7;j>=0;j-=2)
              {
                   n1=bit[j];
                   n2=bit[j-1];
                   ++s2;
                   if(n1==0 && n2==0)
                     fp3.write('A');
                   if(n1==0 && n2==1)
                     fp3.write('T');
                   if(n1==1 && n2==0)
                     fp3.write('C');
                   if(n1==1 && n2==1)
                     fp3.write('G');
               }
               ++s2;
               fp3.write(' ');
           }
           System.out.println("Number of bytes of bit file : "+s1);
           System.out.println("Number of bytes of DNA file : "+s2);
           fp1.close();
           fp2.close();
           fp3.close();
    }
}