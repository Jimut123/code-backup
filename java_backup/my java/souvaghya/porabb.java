class porabb
{
public static void main(String args[])
{
int m;
m=65;
int i,j;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
System.out.print((char)m);
m--;
for(j=i-1;j>=1;j--)
System.out.print((char)m);
m=m+2;
System.out.println(" ");
}
}
}
