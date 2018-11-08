package STRING;


import java.io.*;
class count
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
int i,l,c=0,c1=0;
char ch;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(Character.isUpperCase(ch))
{
c++;
}
if(Character.isLowerCase(ch))
{
c1++;
}
}
System.out.println("No. of capital letters:"+c);
System.out.println("No. of small letters:"+c1);
}
}