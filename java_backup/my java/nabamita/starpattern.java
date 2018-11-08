
class starpattern
{
public static void main()
{
int i,j,k=9,sp=10;
for(i=1;i<=5;i++)
{
for(j=1;j<=sp;j++)
System.out.print(" ");
for(j=1;j<=k;j++)
System.out.print("*"+" ");
k=k-2;
sp=sp+2;
System.out.println("");
}
}
}
