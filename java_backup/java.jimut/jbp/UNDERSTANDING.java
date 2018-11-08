import java . io.*;
class UNDERSTANDING
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String n;
int i,l,j,k;
char ch,c;
System.out.println("ENTER A WORD IN CAPITAL LETTERS:::::::::::::");
n= cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch = n.charAt(i);
c = n.charAt((i+1));
j = (int)ch;
k = (int)c;
if((j+1)==k)
{
System.out.println(ch+","+c);
}
}
}
}


