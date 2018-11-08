import java.io.*;
class func1
{
int i,j,n,n1,n2,k,k1,t,t1,m,m1,m2,p1,p2,l,s=0,s1=0,s2=0,s3=0,p;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Enter no.:");
n=Integer.parseInt(input.readLine());
}
int prime(int x)
{
int j,f2;
f2=0;
for(j=2;j<x;j++)
{
if(x%j==0)
{
f2=1;
break;
}
}
return f2;
}

int digsum(int k)
{
n2=k;
s2=0;
while(n2>0)
{
k1=n2%10;
s2=s2+k1;
n2=n2/10;
}
return s2;
}

void coprime()
{
n1=n;
while(n1>0)
{
k=n1%10;
t=prime(k);
if(t==0)
{
n2=n1/10;
while(n2>0)
{
k1=n2%10;
t1=prime(k1);
if(t1==0)
{
m1=prime(k+k1);
if(k>k1)
m2=prime(k-k1);
else
m2=prime(k1-k); 
if((m1==0)||(m2==0))
System.out.println("Co-prime:"+k+","+k1);
}
n2=n2/10;
}
}
n1=n1/10;
}
}

void smith()
{
i=2;
s=0;
n1=n;
while(n1>1)
{
for(i=2;i<=n1;i++)
{
if(n1%i==0)
{
k=prime(i);
if(k==0)
{
l=i;
p=digsum(l);
s=s+p;
}
break;
}
}
n1=n1/i;
}
s3=digsum(n);
//System.out.println(s);
//System.out.println(s3);
if(s==s3)
System.out.println("Smith no.:"+n);
}
}