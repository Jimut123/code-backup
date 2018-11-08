import java.io.*;
public class st
{
public static void main(String[]args)throws IOException
{
DataInputStream in=new DataInputStream(System.in);
String s,c="";
int a,b;
System.out.println("ENTER WORD");
s=in.readLine();
a=s.length();
for(b=a-1;b>=0;b=b-1)
{
c=c+s.charAt(b);
}
System.out.println(c);
}
}