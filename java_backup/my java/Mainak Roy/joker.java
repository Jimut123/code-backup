public class joker
{
public void num(int n)
{
int a[][]=new int[n][n];
int h=0;
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=++h;
}
}

for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{

if(i==0||i==n-1)
{
System.out.print("  ");
}
else if(j==0||j==n-1)
{
System.out.print("  ");
}
else if(i==j)
{
System.out.print("  ");
}
else if(i==n-1-i)
{
System.out.print("  ");
}
else
{
System.out.print(a[i][j]+" ");
}
}
System.out.println();
}
}
}
