class perfectornot
{
public static void main(int n)
{
int s=0;
for(int i=1;i<=n/2;i++)
if(n%i==0)
s=s+1;
if(s==n)
System.out.print("perfect");
else
System.out.print("Not perfect");
}
}
