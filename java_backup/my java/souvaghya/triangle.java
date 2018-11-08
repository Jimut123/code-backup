class triangle
{
public static void main(int n)
{
int i,j,f,s,x;
s=0;
f=1;
for(i=1;i<=n;i++)
{
x=1;
for(j=1;j<=f;j++)
x=x*f;
s=s+x;
f=f+1;
}
System.out.print(s);
}
}