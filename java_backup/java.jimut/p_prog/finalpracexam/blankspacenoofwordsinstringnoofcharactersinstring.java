package finalpracexam;


import java.io.*;
class blankspacenoofwordsinstringnoofcharactersinstring
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n;
char ch;
int i,l,b=0,w=0,c=0;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==' ')
{
b=b+1;
}
System.out.println("no. of blank spaces:"+b);
{
w=b+1;
}
System.out.println("no. of words:"+w);
{
c=l-b;
}
System.out.println("No. of characters:"+c);
}
}
}