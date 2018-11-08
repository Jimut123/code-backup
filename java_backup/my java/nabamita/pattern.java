class pattern
{
public static void main()
{
int i,j,k=97;
for(i=1;i<=5;i++)
{
System.out.print((char)k);
for(j=1;j<=5-2;j++)
System.out.print((char)(k+1));
System.out.print((char)k);
k++;
System.out.println("");
}
}
}
