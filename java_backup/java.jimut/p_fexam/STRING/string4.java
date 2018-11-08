package STRING;

import java.io.*;
class string4
{
public static void main(String[]args)
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
char ch;
int i,l,m;
System.out.println("Enter a name containing three words");
m=n+charat(0);
n=cd.readLine();
l=n.length();
for(i=1;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==' ')
{
m=' '+n.charAt(i+1);
}
}
System.out.println("Initials:"+n);
}
}