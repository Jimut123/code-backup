import java.io.*;
class twoscomple
{

int i,c=0,s=0;
String f1="",f2="",p="",a="";
char ch,h;

String comple1(String f)
{
f1="";
for(i=0;i<f.length();i++)
{
if(f.charAt(i)=='0')
f1=f1+'1';

else
f1=f1+'0';
    }
    return f1;
}

String comple2(String f,int x)
{
f1="";
f2="";
i=x;
while(i>1)
{
f1=f1+'0';
i--;
    }
    f1=f1+'1';
     f2=add(f,f1,x);
    return f2;
}

String add(String f,String y,int x)
{
f1="";
f2="";
for(i=x-1;i>=0;i--)
{
if(((f.charAt(i)=='1')&&(y.charAt(i)=='0'))&&(c==0))
{
s=1;
c=0;
p=s+p;
}
else
if(((f.charAt(i)=='0')&&(y.charAt(i)=='1'))&&(c==0))
{
s=1;
c=0;
p=s+p;
}
else
if(((f.charAt(i)=='1')&&(y.charAt(i)=='0'))&&(c==1))
{
s=0;
c=1;
p=s+p;
}
else
if(((f.charAt(i)=='0')&&(y.charAt(i)=='1'))&&(c==1))
{
s=0;
c=1;
p=s+p;
}
else
if(((f.charAt(i)=='1')&&(y.charAt(i)=='1'))&&(c==0))
{
s=0;
c=1;
p=s+p;
}
else
if(((f.charAt(i)=='1')&&(y.charAt(i)=='1'))&&(c==1))
{
s=1;
c=1;
p=s+p;
}
else
if(((f.charAt(i)=='0')&&(y.charAt(i)=='0'))&&(c==0))
{
s=0;
c=0;
p=s+p;
}
else
if(((f.charAt(i)=='0')&&(y.charAt(i)=='0'))&&(c==1))
{
s=1;
c=0;
p=s+p;
}
}
f1=p;
p="";

return f1;
}

public void main(String args[])throws IOException
{
int l=0;
String n,s1="",s2="";

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any binary no.:");
n=input.readLine();
l=n.length();
s1=comple1(n);//1's complement of second no.
System.out.println("S1 :"+s1);
s2=comple2(s1,l);//2's complement of second no.
System.out.println("The two's complement of the no. is "+s2);
}
    }
        