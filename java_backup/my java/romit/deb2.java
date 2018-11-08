import java.io.*;
import java.lang.*;
class deb2
{
public static void main(String args[])throws IOException
{
BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
String n;
System.out.println("ENTER THE STRING");
n =Input.readLine();
int i;
for(i=n.length()-1;i>=0;i--)
{
System.out.print( n.charAt(i));
}
}
}