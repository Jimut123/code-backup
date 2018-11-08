class krishnamurti1
{
public static void main (int n)
{
int f,d,s=0,copy=n,i;
while(copy>0)
{
d=copy%10;
f=1;
for(i=1;i<=d;i++)
f=f*i;
s=s+f;
copy=copy/10;
}
if (s==n)
System.out.print(" Special or krishnamurti ");
else
System.out.print("Not Special or krishnamurti ");
}
}