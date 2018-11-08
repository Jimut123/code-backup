
import java.io.*;
class bhasa
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,j,k,x,c;
String s=br.readLine();
String v="aeiouAEIOU";
c=0;
String w="";
String a="";
for(i=0;i<s.length();i++)
{
if (s.charAt(i)!=' ')
{
w=w+s.charAt(i);
}
}
for(i=0;i<w.length();i++)
{
for(j=c;j<=3;j++)
{
a=a+w.charAt(j);
c=c+1;
}
for(k=0;k<=3;k++)
{
for(x=0;x<v.length();x++)
{
if (a.charAt(k)==v.charAt(x))
{
System.out.println(a);
a="";
}
}
}
}
}
}
