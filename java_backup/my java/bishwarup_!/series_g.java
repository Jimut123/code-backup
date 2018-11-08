class series_g
{
public static void main(int n,int x)
{
int s=0,i,t,j;
for(i=1;i<=n;i++)
{
t=1;
for(j=1;j<=i;j++)
t=t*x;
s=s+t;
}
System.out.println(s);
}
}