 

import java.io.*;
class bin_add
{
String a,b,c1;
int i,c,s,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter 1st Binary Number:");
a=br.readLine();
System.out.println("Enter 2nd Binary Number:");
b=br.readLine();
if(a.length()>b.length())
{
k=a.length()-b.length();
i=1;
while(i<=k)
{
b="0"+b;
i++;
}
}
else
if(a.length()<b.length())
{
k=b.length()-a.length();
i=1;
while(i<=k)
{
a="0"+a;
i++;
}
}
System.out.println(a);
System.out.println(b);
add();
}
void add()
{
c=s=0;
c1="";
for(i=a.length()-1;i>=0;i--)
{
if(a.charAt(i)=='0' && b.charAt(i)=='0' && c==0)
{
s=0;
c=0;
c1=s+c1;
}
else
if(a.charAt(i)=='0' && b.charAt(i)=='0' && c==1)
{
s=1;
c=0;
c1=s+c1;
}
else
if(a.charAt(i)=='1' && b.charAt(i)=='0' && c==1)
{
s=0;
c=1;
c1=s+c1;
}
else
if(a.charAt(i)=='1' && b.charAt(i)=='0' && c==0)
{
s=1;
c=0;
c1=s+c1;
}
else
if(a.charAt(i)=='0' && b.charAt(i)=='1' && c==0)
{
s=1;
c=0;
c1=s+c1;
}
else
if(a.charAt(i)=='0' && b.charAt(i)=='1' && c==1)
{
s=0;
c=1;
c1=s+c1;
}
else
if(a.charAt(i)=='0' && b.charAt(i)=='1' && c==0)
{
s=1;
c=0;
c1=s+c1;
}
else
if(a.charAt(i)=='1' && b.charAt(i)=='1' && c==1)
{
s=1;
c=1;
c1=s+c1;
}
else
if(a.charAt(i)=='1' && b.charAt(i)=='1' && c==0)
{
s=0;
c=1;
c1=s+c1;
}
}
c1=c+c1;
System.out.println("The sum is:"+c1);
}
}