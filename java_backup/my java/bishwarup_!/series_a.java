class series_a
{
public static void main(int n)
{
int s=0,k=5,i;
for(i=1;i<=n;i++)
{
s=s+k;
k=(k*10)+5;
}
System.out.print(s);
}
}
