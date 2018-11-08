package STRING;


import java.io.*;
class reverse2
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="",r="",p="";
char ch,c;
int i,j,l,k;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<l;i++)
{
ch=n.charAt(i);
if(ch==' ' || ch=='.')
{
k=m.length();
for(j=k-1;j>=0;j--)
{
c=m.charAt(j);
r=r+c;
}
m="";
p=p+r+ch;
r="";
}
else
m=m+ch;
}
System.out.println(p);
}
}