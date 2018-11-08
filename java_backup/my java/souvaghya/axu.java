class axu
{
public static void main(String args[])
{
int i;int j;
int m;
m=65;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
System.out.print((char)m);
m++;
}
//m=m-2
m-=2;
for(j=i-1;j>=1;j--)
{
System.out.print((char)m);
m--;
}
m=65;
System.out.println("");
}
}
}

