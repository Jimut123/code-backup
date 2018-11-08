import java.io.*;
class twosadd
{
String put(String f,int x)
{
String f1="";
while(x>0)
{
f1=f1+'0';
x--;
}
f=f1+f;
return f;
}
    
public void main(String args[])throws IOException
{
String n1,n2,s1="",s2="",s3="",p="";
int l1,l2,d,i,s=0,c=0;
l1=l2=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any binary no.:");
n1=input.readLine();
System.out.println("Enter another binary no.:");
n2=input.readLine();
l1=n1.length();
System.out.println("L1:   "+l1);
l2=n2.length();
System.out.println("L2:   "+l2);
if(l1>l2)
{
d=l1-l2;
System.out.println("D:   "+d);
s2=put(n2,d);
System.out.println("S2:   "+s2);
s1=n1;
}
else
if(l2>l1)
{
d=l2-l1;
s1=put(n1,d);
s2=n2;
}
else
if(l1==l2)
{
s1=n1;
s2=n2;
    }

for(i=l1-1;i>=0;i--)
{
if(((s1.charAt(i)=='1')&&(s2.charAt(i)=='0'))&&(c==0))
{
s=1;
c=0;
p=s+p;
}
else
if(((s1.charAt(i)=='0')&&(s2.charAt(i)=='1'))&&(c==0))
{
s=1;
c=0;
p=s+p;
}
else
if(((s1.charAt(i)=='1')&&(s2.charAt(i)=='0'))&&(c==1))
{
s=0;
c=1;
p=s+p;
}
else
if(((s1.charAt(i)=='0')&&(s2.charAt(i)=='1'))&&(c==1))
{
s=0;
c=1;
p=s+p;
}
else
if(((s1.charAt(i)=='1')&&(s2.charAt(i)=='1'))&&(c==0))
{
s=0;
c=1;
p=s+p;
}
else
if(((s1.charAt(i)=='1')&&(s2.charAt(i)=='1'))&&(c==1))
{
s=1;
c=1;
p=s+p;
}
else
if(((s1.charAt(i)=='0')&&(s2.charAt(i)=='0'))&&(c==0))
{
s=0;
c=0;
p=s+p;
}
else
if(((s1.charAt(i)=='0')&&(s2.charAt(i)=='0'))&&(c==1))
{
s=1;
c=0;
p=s+p;
}
}
p=c+p;
 System.out.println("Addition value :"+p);
 }
 }