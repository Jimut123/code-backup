package STRING;


import java.io.*;
class palindrome
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n="",r="",m="";
char ch,c;
int i,j,l,k;
System.out.println("Enter a sentence:");
n=cd.readLine();
l=n.length();
for(i=0;i<l;i++)
{
ch=n.charAt(i);
if((ch!=' ')&&(ch!='.'))
{
m=m+ch;
}
else if(ch==' ')
{
k=m.length();
for(j=l-1;j>=0;j--)
{
c=n.charAt(j);
r=r+ch;
}
if(r.equals(m));
{
System.out.println(m);
}
m="";
r="";
}
}
}
}
