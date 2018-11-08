package STRING;


import java.io.*;
class patteRNwater
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n="WATER";
int i=0,j,l=n.length();
char ch;
for(i=l-1;i>=0;i--)
{
for(j=i;j>=0;j--)
{
ch=n.charAt(i);
System.out.print(j);
}
System.out.println("");
}
}
}