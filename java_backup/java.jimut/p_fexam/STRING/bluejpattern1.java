package STRING;


import java.io.*;
class bluejpattern1
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
char ch,p;
int i,j,l,k;
System.out.println("Enter a word:");
n=cd.readLine();
l=n.length();
for(i=0;i<l;i++)
{
for(j=i;j<l;j++)
{
ch=n.charAt(j);
System.out.print(ch);
}
for(k=0;k<=i-1;k++)
{
p=n.charAt(k);
System.out.println(p);
}
System.out.println();
}
}
}