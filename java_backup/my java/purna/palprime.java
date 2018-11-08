
import java.io.*;
class palprime
{
int i,k,k1;
void input()
{
for(i=1;i<=1000;i++)
{
k=palincheck(i);
if(k==1)
{
k1=primecheck(i);
if(k1==0)
System.out.println("palprime"+i);
}
}
}
int palincheck(int x)
{
int x1=x;
int k=0,s=0;
while(x>0)
{
k=x%10;
s=(s*10)+k;
x=x/10;
}
if(s==x1)
{
//System.out.println(s);
//System.out.println(x1);
return 1;
}
else
return 0;
}
int primecheck(int x)
{
int c=0;
for(int j=2;j<x;j++)
if(x%j==0)
{
c=1;
break;
}
return c;
}
}