class TwinPrime
{
public static void main(int n)
{
int a=1,b=0,i,j,c=0;
for(i=2;i<=n;i++)
{
c=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
c=1;
break;
}
if(c==0)
{
 b=i;
if((b-a)==2)
System.out.println("Twin Prime no.s are="+a+" "+b);
a=b;
}
}
}
}


