class Pal_Prime
{
int i,f,j,n1,k,s;
void input(int n)
{
System.out.println(n);
prime(n);
}
void prime(int i)
{
f=0;
for(j=2;j<(i-1);j++)
{
if(i%j==0)
{
f=1;
break;
}
}
if(f==0)
{
if(pal(i)==0)
System.out.println("Pal-Prime number: "+i);
else
System.out.println("Non Pal-Prime number: "+i);
}
else
System.out.println("Non Pal-Prime number: "+i);
}
int pal(int n1)
{
int n2=n1;
while(n1>0)
{
k=n1%10;
s=s*10+k;
n1=n1/10;
}
if(s==n2)
return 0;
else
return 1;
}
}
