package STRING;


import java.io.*;
public class honesty
{
int i,l,c;
String n,m="";
char ch;
void display(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
System.out.println("Type 1 for choice 1 and Type 2 for choice 2");
n=cd.readLine();
n=n+"";
l=n.length();
if(c==1)
System.out.println(n.charAt(0));
for(i=1;i<l;i++)
{
ch=n.charAt(i);
if(c==' ')
{
System.out.println(n.charAt(i+1));
}
}
if(c==2)
{
for(i=0;i<l;i++)
{
ch=n.charAt(i);
}
if(c==' ')
{
System.out.println(n.charAt(i-1));
}
else
{
System.out.println("Wrong choice");
}
}
}
}