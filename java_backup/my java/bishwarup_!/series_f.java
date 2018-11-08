class series_f
{
public static void main(int n)
{
int k=1,s=0,j=1,i;
for(i=1;i<=n;i++)
{
s=s+(j*k);
k=k*-1;
j=j+2;
}
System.out.println(s);
}
}