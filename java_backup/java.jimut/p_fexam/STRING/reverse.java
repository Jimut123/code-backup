package STRING;


import java.io.*;
class reverse
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String s,p="",q="";
char ch;
int i,l;
System.out.println("Enter a word:");
s=cd.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
{
ch=s.charAt(i);
q=q+ch;
}
p=q;
System.out.println(q);
}
}