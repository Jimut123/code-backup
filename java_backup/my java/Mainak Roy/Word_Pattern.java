import java.io.*;
public class Word_Pattern
{
public static void main(String args[]) throws IOException
{
    DataInputStream in=new DataInputStream(System.in);
    System.out.println("enter string");
    String w=in.readLine();
    w=w.trim();
    int l=w.length();
    int m=l/2;
    int m1=m-1;
    int m2=m+1;
    int h=m-1;
    int q=l-m;
    int xyz=1;
    for(int z=0;z<m;z++)
    {
        System.out.print(" ");
    }
    System.out.println(w.charAt(m));
    for(int i=0;i<m;i++)
    {
        for(int k=0;k<h-i;k++)
        {
         System.out.print(" ");
        }       
        System.out.print(w.charAt(m1));
        int i2=2*i;
        for(int ml=0;ml<xyz;ml++)
        {
            System.out.print(" ");
        }
        xyz=xyz+2;
        System.out.println(w.charAt(m2));
        if(m1>0)
        {
            m1--;
        }
        if(m2<l-1)
        {
            m2++;
        }
    }
}
}
            
            