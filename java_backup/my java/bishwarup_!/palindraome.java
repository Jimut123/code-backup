class palindraome
{
public static void main( int n)
{
int d,r=0,copy=0;
while (n>0)
{
d=copy%10;
r=r*10+d;
copy/=10;
}
if (r==n)
System.out.print ("palindrome");
else
System.out.print ("not Palindrome");
}
}
