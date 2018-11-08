class sl3
{
public static void main(int n)
{
int i,j,l,k=0,m,a=65;
for(i=1;i<=n;i++)
{
for(j=n;j>=i;j--)
{
System.out.print((char)a);
}
a++;
System.out.println();
}
}
}