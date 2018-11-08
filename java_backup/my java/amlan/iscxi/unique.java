package iscxi;


class unique
{
public static void main(String args[])
{
int i,n,n1,f,k,k1;
for(i=1;i<=1000;i++)
{
n=i;
f=0;
while(n>0)
{
k=n%10;
n1=n/10;
while(n1>0)
{
k1=n1%10;
if(k1==k)
{
f=1;
break;
}
n1=n1/10;
}
if(f==1)
break;
n=n/10;
}
if(f==0)
System.out.println(i);
}
}
}