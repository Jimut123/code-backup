package file_operation;
import java.io.*;
import java.util.*;
class array_bin
{
    void read()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileOutputStream fw=new FileOutputStream("data.txt");
        DataOutputStream dw=new DataOutputStream(fw);
        int ch=0,k;
        do
        {
            System.out.print("Enter a number :- ");
            k=Integer.parseInt(in.readLine());
            dw.writeInt(k);
            System.out.print("Enter 1 to exit or any other number to continue ");
            ch=Integer.parseInt(in.readLine());
        }while(ch!=1);
        dw.close();
        //fw.close();
    }
    void write()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileInputStream fin=new FileInputStream("data.txt");
        DataInputStream din=new DataInputStream(fin);
        int a[]=new int[50];
        int i,j;
        boolean eof=true;
        i=0;
        while(!eof)
        {
            a[i]=din.readInt();
            i++;
        }
        for(j=0;j<i;j++)
        {
            System.out.print("Elements:"+a[j]+" ");
        }
    }
}