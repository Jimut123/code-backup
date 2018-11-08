package Apc;
import java.io.*;
class Apc_66_7
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter a string:");
        String n= cd.readLine();
        int l=n.length();
        int i,j,d=0;
        char ch,c;
        System.out.println("Character      frequency");
        for(j=65;j<=90;j++)
        {
            ch=(char)j;
        for(i=0;i<l;i++)
        {
            c=n.charAt(i);
            if(ch==c)
            {
                d++;
            }
        }
            if(d>0)
            {
                System.out.println(ch+"  \t  "+d);
                d=0;
            }
        
    }
}
}
