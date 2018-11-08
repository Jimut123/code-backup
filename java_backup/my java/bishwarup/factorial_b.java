class factorial_b
{
public static void main(int n)
{
int s=0,j=1,i,f,k;
for(i=1;i<=n;i++)
{
f=1;
for(k=1;k<=j;k++)
f=f*k;
s=s+j/f;
j=j+2;
}
System.out.print(s);
}
}
