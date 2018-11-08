import java . io . * ;
public class kkf 
{
public static void main ( int n  )
{
int k,s = 0;
while (n>0)
{
k = n % 10;
s = (s*10) + k;
n = n / 10;
}
System.out.println (+s );
}
}

