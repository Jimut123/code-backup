package STRING;



import java.io.*;
class uniquestring
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="";
char ch,c=0;
int i,l,x=1,j;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=1;i<=l-1;i++)
{
ch=n.charAt(i);
for(j=0;j<m.length();j++)
{
ch=n.charAt(j);
if(ch==c)
x=0;
}
m=m+ch;
}
if(x==1)
System.out.println("Unique string");
else if(x==0)
System.out.println("Not unique");
}
}