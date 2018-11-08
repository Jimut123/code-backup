package practical;

import java.io.*;
class sum
{
    public static void main(String args[])throws IOException
    {
        DataInputStream di=new DataInputStream(System.in);
        int a,b,c;
        a=Integer.parseInt(di.readLine());
         b=Integer.parseInt(di.readLine());
         c=a+b;
         System.out.println(c);
        }
    }