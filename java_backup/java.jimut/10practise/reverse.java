import java . io . * ;
public class reverse
{
public static void main ( int n )
{
int m=0,s=0,j=0,k=0;
while (n>0)
{
s = n % 10;
m = m + s;
s = n / 10;
if(s>0)
{
while (s >= 1)
{
k = s % 10;
j = (j*10) + k;
s = s / 10;
}
}
}
System.out.println (+m );
}
}

