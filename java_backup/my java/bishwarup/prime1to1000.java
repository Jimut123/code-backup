class prime1to1000
{
public static void main()
{
int i,f=0,j;
for(i=1;i<=1000;i++)
{
for(j=2;j<=1;j++)
if(i%j==0)
{
f=1;
break;
}
if(f==0)
System.out.print(j);
}
}
}