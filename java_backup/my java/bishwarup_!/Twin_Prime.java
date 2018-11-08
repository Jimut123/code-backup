class Twin_prime
{
public static void main(int n)
{
int i,j,j1,f,f1;
for(i=1;i<=n;i++)
{
f=0;
for(j=2;j<i;j++)
if(i%j==0)
{
f=1;
break;
}
if(f==0)
{
for(j1=i+1;j1<=n;j1++)
{
f1=0;
for(j=2;j<j1;j++)
if(j1%j==0)
{
f1=1;
break;
}
if(f1==0)
{
if((i-j1==2)||(i-j1==-2))
{
System.out.println(i+","+j1);
}
}
}
}
}
}
}
