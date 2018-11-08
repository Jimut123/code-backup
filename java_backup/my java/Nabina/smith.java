import java.io.*;
class smith
{
int j,p,s1=0,f=0,j1;

int sum(int x)
{
s1=0;
while(x>0)
{
p=x%10;
s1=s1+p;
x=x/10;
}
return s1;
}

int prime(int x)
{
f=0;
for(j1=2;j1<x/2;j1++)
{
if(x%j1==0)
{
f=1;
break;
}
}
return f;
}

public void main(String args[])throws IOException
{

int n,i=2,s2=0,s3=0,q,r;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter any no.:");
n=Integer.parseInt(input.readLine());
s2=sum(n);
j=n;
while(i<=j)
{
q=prime(i);
if(j%i==0)
{
if(q==0)
{
r=sum(i);
s3=s3+r;
j=j/i;
}
}
else
i++;

}

if(s2==s3)
{
System.out.println("S2 "+s2);
System.out.println("S3 "+s3);

System.out.println("SMITH NUMBER "+n);
}
else
{

System.out.println("S2 "+s2);
System.out.println("S3 "+s3);

System.out.println("NOT SMITH NUMBER "+n);
}
}
}