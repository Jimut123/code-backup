
import java.io.*;
class twoscopmlement
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int l,i,m,f;
char h;
String n;
String s;
s=n="";
System.out.println("Enter The Bianary No");
n=Input.readLine();
l=n.length();
char a[]=new char[l];
for(i=0;i<l;i++)
{
h=n.charAt(i);
a[i]=h;
}
f=0;
for(m=i-1;m>=0;m--)
{
if(a[m]=='0')
s=s+'0';
else
if(a[m]=='1')
{
s=s+'1';
f=1;
break;
}
}
if(f==1)
{
for(i=m-1;i>=0;i--)
{
if(a[i]=='0')
s=s+'1';
else
if(a[i]=='1')
s=s+'0';
}
}
for(i=s.length()-1;i>=0;i--)
System.out.print(s.charAt(i));
}
}