import java.io.*;
class pattern4
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int i,k,l;
System.out.println("Enter The String");
String n=Input.readLine();
l=n.length();
for(i=0;i<l;i++)
{
if((i==0)||(i==l-1))
{
System.out.print(n);
}
else
{
for(k=0;k<=i;k++)
{
if(k==i)
{
System.out.print(n.charAt(k));
}
else
{
System.out.print(" ");
}
}
}
System.out.println(" ");
}
}
}
