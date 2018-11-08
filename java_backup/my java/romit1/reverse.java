import java.io.*;
import java.lang.*;
class reverse

{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
String n;
char h;
int i,j;
System.out.println("ENTER THE NAME");
n=Input.readLine();
for(i=n.length()-1;i>=0;i--)
{
h =n.charAt(i);
System.out.print(h);
}
}
}
