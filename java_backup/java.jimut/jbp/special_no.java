import java . io . * ;
public class special_no
{
public static void main (  )
{
int k,s = 0,i,j,f,m;
for (i = 100 ; i <= 999 ; i++)
{
j = i;
s = 0 ;
while (j > 0)
{
k = j % 10;
f = 1;
for ( m = 1 ; m <=k ; m++)
f = f * m;
s = s + f;
j = j / 10;
}
if (s == i)
System.out.println ("special number"+i);
}
}
}