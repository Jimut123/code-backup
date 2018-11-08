 

class pattern
{
public static void main(int n)
{
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
System.out.print(i);
for(j=i-1;j>=1;j--)
System.out.print(i-1);
System.out.println("");
}
}
}
