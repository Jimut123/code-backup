import java . io . *;
public class palindrome
{
public static void main (int n)
{
int k,j,s=0,n1;
n1=n;
while (n>0)
{
k=n%10;
s=(10*s)+k;
n=n/10;
}
if (n1==s)
System.out.println ("Palindrome");
else
System.out.println ("Non-palindrome");
}
}