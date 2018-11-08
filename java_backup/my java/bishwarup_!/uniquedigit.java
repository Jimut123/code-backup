class uniquedigit
{
public static void main(int n)
{
int k,k1,f,f1,n1,m=n;
f1=0;
while(n>0)
{
k=n%10;
f=0;
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
{
f1=1;
break;
}
n=n/10;
}
if(f1==1)
System.out.println("Non-Unique!!!");
else
System.out.println("Unique Digit Integer: "+m);
}
}
