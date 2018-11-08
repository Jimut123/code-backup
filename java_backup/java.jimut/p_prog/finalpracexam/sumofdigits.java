package finalpracexam;


class sumofdigits
{
public static void main(int n)
{
int a,s=0;
while(n>0)
{
a=n%10;
s=s+a;
n=n/10;
}
System.out.println("THE SUM OF DIGITS="+s);
}
}