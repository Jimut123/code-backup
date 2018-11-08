public class p2
{
public static void main(int n)
{
int a,i,j;a=65;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)a);
a++;
}
a=a-2;
for(j=i-1;j>=1;j--)
{
System.out.print((char)a);
a=a-1;
}
a=65;
System.out.println(" ");
}
}
}
