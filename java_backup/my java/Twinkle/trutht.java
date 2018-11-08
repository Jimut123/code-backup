import java.io.*;
class trutht
{

int i,c=0,s=0;
String f1="",f2="",p="",a="";
char ch,h;

String comple(String f)
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

double binary(double x)
       {
         double s;
         s=0;
         while(x>0)
         {
         if(x%2==0)
         s=s*10+0;
         else
         s=s*10+1;
         x=x/2;
         }
         return s;
         }
         }
  double count(double x)
  {
    c=0;
    while(x>0)
    {
      p1=x%10;
      if(p1==1)
      {
         c++;
         x=x/10;
         }       
    }
    return c;
    }
    
public void main(String args[])throws IOException
{
int l=0;
String e,s1="",s2="";

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter expression:");
e=input.readLine();
l=e.length();
for(i=0;i<e.length();i++)
{
ch=s.charAt(i);


s1=comple1(n);//1's complement of second no.
System.out.println("S1 :"+s1);
s2=comple2(s1,l);//2's complement of second no.
System.out.println("The two's complement of the no. is "+s2);
}
    }
    

  double c,p1;
  
    
       int a=65;
       double p,n,i,q,r;
          
       System.out.println("Enter no.:");
       n=Integer.parseInt(input.readLine());
       p=Math.pow(2,n);
       
       for(i=0;i<n;i++)
       {
       System.out.print((char)a);
       a++;
       }
       System.out.println();
       
       for(i=0;i<p;i++)
       {
       q=binary(i);
       System.out.print(q+" ");
       r=count(q);
       if(r>2)
       System.out.print("1");
       else
       System.out.print("0");
       
       System.out.println("");
       }
       }       
       }
       }