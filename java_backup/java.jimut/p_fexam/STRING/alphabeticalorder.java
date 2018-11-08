package STRING;


import java.io.*;
class alphabeticalorder
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
System.out.println("Enter any string:");
n=cd.readLine();
n=n+"";
int i,j,l,a=0;
char ch;
l=n.length();
for(i=65;i<=90;i++)
{
for(j=0;j<l;j++)
{
ch=n.charAt(j);
a=ch;
if(ch==(char)i||ch==(char)(i+32))
{
System.out.print(ch);
}
}
}
}
}