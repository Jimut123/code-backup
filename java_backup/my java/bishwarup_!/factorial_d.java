class factorial_d
{
public static void main(int n)
{
int s=0,i,f=1,j=1,k;
for(i=1;i<=n;i++)
{
f=1;
for(k=1;k<=j;k++)
f=f*k;
s=s+f;
}
System.out.println(s);
}
}
