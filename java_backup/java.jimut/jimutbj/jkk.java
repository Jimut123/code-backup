import java . io . * ;
public class pallindrome
{
public static void main ( int n  )
{
int k,s = 0,n1 = n;
while (n>0)
{
k = n % 10;
s = (s*10) + k;
n = n / 10;
}
System.out.println (+s );
if (s == n1)
System.out.println ("it is a pallindrome number");
else
System.out.println ("it is not a pallindrome number");
}
}

