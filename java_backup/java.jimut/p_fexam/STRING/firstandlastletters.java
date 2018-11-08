package STRING;


import java.io.*;
class firstandlastletters
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
char ch;
int i,l;
System.out.println("Enter a string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(i==0)
{
m=m+ch;
}
else if(ch=='.')
{
m=m+ch+n.charAt(i+1);
i++;
}
}
System.out.println(m);
}
}