
class pattern1
{
public static void main()
{
int i,j,k =97;
for(i=5;i>=1;i--)
{
for(j=1;j<=i;j++)
System.out.print((char)k);
k++;
System.out.println("");
}
k-=2;
for(i=2;i<=5;i++)
{
for(j=1;j<=i;j++)
System.out.print((char)k);
k--;
System.out.println("");
}
}
}
