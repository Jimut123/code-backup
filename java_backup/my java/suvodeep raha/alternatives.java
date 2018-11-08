class alternatives
{
public static void main(int n)
{
int s1=0;
int n1=n;
int c=0;
int s=1;
while(n1>0)
{
int k=n1%10;
c++;
if(c%2!=0)
{
s=s*k;
}
else
s1=s1+k;
n1=n1/10;
}
System.out.println("Product"+"="+s);
System.out.println("Sum"+"="+s1);
}
}
