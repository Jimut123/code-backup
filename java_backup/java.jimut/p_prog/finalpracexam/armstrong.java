package finalpracexam;


class armstrong
{
public static void main(int n)
{
int a,num,s=0;
num=n;
while(n>0)
{
a=n%10;
s=s+a*a*a;
n=n/10;
}
if(num==s)
System.out.println("The no"+num+"is Armstrong no");
else
System.out.println("The no"+num+"is not Armstrong no");
}
}