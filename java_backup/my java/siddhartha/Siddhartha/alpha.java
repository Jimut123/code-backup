class alpha
{
public static void main(int n)
{
int i,j,l,k=0,m,a=65;
l=n;
for(i=1;i<=n;i++)
{
for(j=1;j<=l;j++)
{
System.out.print((char)a);
a++;
}
for(m=1;m<=k;m++)
System.out.print(" ");
if(i==1)
j=j-1;
else
j=j-1;
while(j>=1)
{
System.out.print((char)a);
a--;
}
l=l-1;
k=k+2;
System.out.println();
}
}
}