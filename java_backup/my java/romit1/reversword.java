import java.io.*;
import java.lang.*;
class reversword
{
public static void main(String args[])throws IOException
{
BufferedReader Input =new BufferedReader(new InputStreamReader(System.in));
String n,b;
int i,j;
b="";
System.out.println("ENTER THE STRING");
n=Input.readLine();
for(i=0;i<n.length();i++)
{
if(n.charAt(i)==' ')
{
for(j=b.length()-1;j>=0;j--)
{
System.out.print(b.charAt(j));
}
System.out.print(" ");
b="";
}
else
{
b=b+n.charAt(i);
}
}
for(j=b.length()-1;j>=0;j--)
{
System.out.print(b.charAt(j));
}
}
}
