
import java.io.*;
class encodeToDecode1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,k,m,f;
String s,w,s1;
System.out.println("Give Code:");
s=br.readLine();
s1="";
for(i=s.length()-1;i>=0;i--)
{
s1=s1+s.charAt(i);
}
System.out.println(s1);
f=1;
for(i=0;i<s1.length();)
{
//System.out.println(i);
//System.out.println(s1.substring(i,(i+2)));
//System.out.println(s1.substring(2,2));
//System.out.println(s1.substring(4,2));
w=s1.substring(i,(i+2));
//System.out.println("ff"+w);
k=Integer.parseInt(w);

if(k>=65 && k<=90)
{
if(f==1)
{
System.out.print((char)k);
f=0;
}
else
System.out.print((char)k);
i=i+2;
}
else
if(k>=97 && k<=122)
{
if(f==1)
{
System.out.print((char)(k-32));
f=0;
}
else
System.out.print((char)k);
i=i+2;
}
else
if(k==32)
{
System.out.print((char)k);
f=1;
i=i+2;
}
else
{
w=s1.substring(i,(i+3));
//System.out.println("ff"+w+i);
k=Integer.parseInt(w);
if(k>=100 && k<=122)
{
if(f==1)
{
System.out.print((char)(k-32));
f=0;
}
else
System.out.print((char)k);
i=i+3;
}
else
if(k==32)
{
System.out.print((char)k);
f=1;
i=i+3;
}}
}
}
}
