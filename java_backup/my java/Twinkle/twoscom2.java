import java.io.*;
class twoscom2
{

int i,c=0,s=0;
String f1="",f2="",p="",a="";
char ch,h;

String put(String f,int x)
{
  while(x>0)
  {
      f='0'+f;
      x--;
    }
    return f;
}

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

String comple2(String f,int x,int r)
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
     f2=add(f,f1,x,r);
    return f2;
}

String add(String f,String y,int x,int r)
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

if((c==0)&&(r==2))
{
 f2=comple2(f1,x,r);//2's complement of final added no.
    return f2;        
}
else
return f1;
}

public void main(String args[])throws IOException
{
int l=0,l1=0,l2=0,d,c=0;
String n1,n2,s1="",s2="",s3="",s4="",s5="",s6="";

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any binary no.:");
n1=input.readLine();
System.out.println("Enter another binary no. to subtract from "+n1+" :");
n2=input.readLine();
l1=n1.length();
l2=n2.length();
if(l1>l2)
{
l=l1;
d=l1-l2;
s1=n1;
s2=put(n2,d);//adding 0s' to the smaller no. for easier calculation
    }
    else
    if(l2>l1)
    {
        l=l2;
        d=l2-l1;
        s1=put(n1,d);//adding 0s' to the smaller no. for easier calculation
        s2=n2;
    }
    else
    if(l1==l2)
    {
        l=l1;
        s1=n1;
        s2=n2;
    }
    
    s3=comple1(s2);//1's complement of second no.
System.out.println("S3 :"+s3);
c++;
    s4=comple2(s3,l,c);//2's complement of second no.
System.out.println("S4 :"+s4);
c++;
    s5=add(s1,s4,l,c);//adding the first no. and second no.
    System.out.println("S5 :"+s5);
//     if(l2>l1)
//     {    
//     s6=add(s5,a,l);
//     s6='-'+s6;
// }
//     else
//     {
    s6=s5;
// }
    System.out.println("Your subtracted value is:  "+s6);
}
    }
        