import java . io.*;
class applications
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s,m="";
int i,j,l,x=1;
char ch,ch1;
System.out.println("ENTER A WORD::");
s = cd.readLine();
l = s.length();
for(i=0;i<=l-1;i++)
{
ch = s.charAt(i);
for(j=0;j<m.length();j++)
{
ch1 = m.charAt(j);
if((ch==ch1)||(Math.abs((int)ch - (int)ch1)==32))
{
x=0;
}}
if(x==1)
{
m=m+ch;
}
x=1;
}
System.out.println(m);
}
}



