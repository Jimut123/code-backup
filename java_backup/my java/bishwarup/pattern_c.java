class pattern_c
{
public static void main()
{
int i,j,m;
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
System.out.print(j);
for(m=j-2;m>=1;m--)
System.out.print(m);
System.out.println("");
}
}
}