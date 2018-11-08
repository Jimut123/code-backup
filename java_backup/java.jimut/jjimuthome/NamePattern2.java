import java.io.*;
public class NamePattern2
{
 public static void main(String args[]) throws IOException
 {  
     DataInputStream in= new DataInputStream(System.in);
     System.out.println("enter string");
     String w=in.readLine();
     System.out.println("enter position of intersection");
     int p=Integer.parseInt(in.readLine());
     w=w.trim();
     int l=w.length();
     for(int i=0;i<l;i++)
     {
       if(i!=p-1)
       {
         for(int j=1;j<p;j++)
         {
         System.out.print("  ");
        }
        System.out.println(w.charAt(i));
       }
       else
       {
           for(int k=0;k<l;k++)
           {
               System.out.print(w.charAt(k)+" ");
            }
            System.out.println();
        }
    }
 }
}
        