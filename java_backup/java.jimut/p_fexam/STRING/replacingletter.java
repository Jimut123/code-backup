package STRING;

import java.io.*;
class replacingletter
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
String n,m="",p="";
int i,l;
char ch;
System.out.println("Enter any string:");
n=cd.readLine();
l=n.length();
for(i=0;i<=l-1;i++)
{
ch=n.charAt(i);
if(ch!=' ')
{
m=m+ch;
p=m.replace("Blue","Red");
}
else
{
p=p+""+m;
}
System.out.print(m);
}
}
}