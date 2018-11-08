class palindrome
{
public static void main(int n)
{
int n1=0,n2=n;
while(n>0)
{
n1=(n1*10)+n%10;
n=n/10;
}
if(n1==n2)
System.out.print("palindrome");
else
System.out.print(" non-palindrome");
}
}