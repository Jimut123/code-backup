
class starpattern2
{
public static void main()
{
int i,j,sp=8,k;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
System.out.print("*");
for(k=1;k<=sp;k++)
System.out.print(" ");
for(j=i;j>=1;j--)
System.out.print("*");
System.out.println(" ");
sp=sp-2;
}
}
}
