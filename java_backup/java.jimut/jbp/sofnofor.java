import java . io . * ;
 class sofnofor
{
public static void main ( int n  )
{
int k,s = 0;
while (n>0)
{
k = n % 10;
s = s + k;
n = n / 10;
}
System.out.println (+s );
}
}

