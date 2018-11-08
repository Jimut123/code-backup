class armstrong
{
public static void main(int n)
{
int n1,q,r,s=0;
n1=n;
while(n>999)
{
q=n/10;
r=n%10;
s=s+(r*r*r);
n=q;
}
if(n1==s)
System.out.print(n1+" is armstrong");
else
{
System.out.print(n1+"not armstrong");
}
}
}
