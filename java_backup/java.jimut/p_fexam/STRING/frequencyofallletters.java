package STRING;


import java.io.*;
class frequencyofallletters
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
int i,j,l,f=0;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=65;i<=90;i++)
{
for(j=0;j<l;j++)
{
if(n.charAt(j)==i)
{
f++;
}
}
if(f>0)
{
System.out.println((char)i+"\t"+f);
}
}
}
}