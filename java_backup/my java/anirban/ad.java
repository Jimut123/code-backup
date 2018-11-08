import java.io.*;
class ad
{
public static void main(String args[])throws IOException
{
String s,w;
String a[]=new String[100];
int i,t,j,m;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
w="";
System.out.println("Give String:");
s=br.readLine();
t=0;
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='.')
{
a[t++]=w;
w="";
}
else
w=w+s.charAt(i);
}
for(i=0;i<t;i++)
{
w=a[i];
//encoding of string
for(j=0;j<w.length();j++)
{
m=(int)w.charAt(j);
if(m==89)
m=65;
else
if(m==90)
m=66;
else
if(m==121)
m=97;
else
if(m==122)
m=98;
else
if(m!=32)
 m=m+2;
System.out.print((char)m);
}
}
}
}
