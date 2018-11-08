package iisscc.smith;
import java.io.*;
public class smith_chk
{
int p,s1=0,f=0,j1;
public int sum(int x)
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
public int prime(int x)
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
public int check(int n)
{
int i=2,j,s2=0,s3=0,q,r;
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
return 1;
else
return 0;
}
}
