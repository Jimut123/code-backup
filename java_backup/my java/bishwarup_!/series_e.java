class series_e
{
public static void main(int n)
{
int s=0,i,x,j;
for(i=1;i<=n;i++)
{
x=1;
for(j=1;j<=i;j++)
x=x*i;
s=s+x;
}
System.out.print(s);
}
}



