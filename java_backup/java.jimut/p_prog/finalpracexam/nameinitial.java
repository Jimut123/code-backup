package finalpracexam;

import java.io.*;
class nameinitial
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
int i,l;
char ch;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==0)
{
m=m+ch;
}
else if(ch=='.')
{
m=m+ch+n.charAt(i+1);
}
}
System.out.print(m);
}
}
