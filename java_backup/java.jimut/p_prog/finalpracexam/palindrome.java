package finalpracexam;


class palindrome
{
public static void main(int n)
{
int d,c,r=0;
c=n;
do
{
d=n%10;
r=r*10+d;
n=n/10;
}
while(n!=0);
if(r==c)
System.out.println("The no" +c+ "is Palindrome no");
else
System.out.println("The no" +c+ "is not Palindrome no");
}
}