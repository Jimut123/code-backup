import java.io.*;
import java.lang.*;
class name2
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m=" ",p=" ",q=" ",r=" ";
char ch;
int i,j=0,k=0,l,b=0;
System.out.println("Enter a name containing three words:");
n=cd.readLine();
q=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch==' ')
b=b+1;
if(b==1)
j=i;
else if(b==2)
k=i;
}
p=n.substring(0,j);
q=n.substring(j+1,k);
r=n.substring(k+1,l);
m=r+' '+p+' '+q;
System.out.println(m);
}
}