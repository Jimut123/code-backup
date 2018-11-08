package STRING;


import java.io.*;
class newword
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
System.out.println("Enter any string:");
n=cd.readLine();
int i,l;
l=n.length();
char ch;
for(i=1;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==' ')
{
m=m+n.charAt(i+1);
}
}
System.out.println(m);
}
}