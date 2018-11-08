import java.io.*;
class fig
{
public static void main(String args[])throws IOException
{

int i,j,p;
String s,s1="";

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter text :");
s=input.readLine();
for(i=0;i<s.length();i++)
{
for(j=0;j<=i;j++)
{
s1=s1+s.charAt(j);
}
for(p=s1.length()-1;p>=0;p--)
{
System.out.print(s1.charAt(p)+" ");
}
s1="";
System.out.println();
}
}
}