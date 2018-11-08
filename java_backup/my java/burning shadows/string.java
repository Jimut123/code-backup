import java.io.*;
public class string
{
public static void main(String[]args)throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int i=0;
int n=0;
String s="";
String z="";
System.out.println ("enter string");
s=in.readLine();
n=s.length();
s=s+" ";
for(i=0;i<s.length();i++)
{
    if(s.charAt(i)==' ')
    {
       
            System.out.print (z.charAt(0)+".");
            z="";
        
    }
    else
    z=z+s.charAt(i);
}
}
}

