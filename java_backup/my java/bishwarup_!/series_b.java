class series_b
{
public static void main(int n)
{
int p,i,j;
p=n;
for(i=n;i>=1;i--)
{
while(p>i)
{
System.out.print(p);
p--;
}
for(j=1;j<=i;j++)
System.out.print(i);
p=n;
System.out.println(" ");
}
}
}

