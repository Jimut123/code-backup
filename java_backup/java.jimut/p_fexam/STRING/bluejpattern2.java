package STRING;


import java.io.*;
class bluejpattern2
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
for(i=l-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
ch=n.charAt(j);
System.out.print(ch);
}
for(k=0;k<=l-2-i;k++)
{
p=n.charAt(k);
System.out.print(p);
}
System.out.println();
}
}
}