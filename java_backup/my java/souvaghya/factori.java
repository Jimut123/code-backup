class factori
{
public static void main(int n)
{
int s,k,i,j,f;
s=0;
k=1;
for(i=1;i<=n;i++)
{
f=1;
for(j=1;j<=k;j++)
f=f*j;
s=s+f;
}
System.out.print(s);
}
}