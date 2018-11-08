class otfto
{
public static void main(String args[])
{
int i;int j;
int sp;
sp=15;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
System.out.print(j);
for(j=1;j<=sp;j++)
System.out.print(" ");
for(j=i;j>=1;j--)
System.out.print(j);
sp=sp-2;
System.out.println(" ");
}
}
}
