class magic
{
public static void main(int n)
{
int n1,k=0,p=0;
if(n==1)
{
System.out.print("magic");
}
else
{
n1=n;
while(n1>=10)
{
p=n1;
int s=0;
while(p>0)
{
k=p%10;
s=s+k;
p=p/10;
}
n1=s;
}
if(n1==1)
System.out.print("magic");
else
System.out.print(" non-magic");
}
}
}