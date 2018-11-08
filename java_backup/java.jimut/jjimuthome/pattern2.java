
import java . io .*;
public class pattern2
{
public static void main(String args)
{
int i,j,m=0;
for (i = 1 ; i <= 5 ; i++)
if (i%2 == 0)
 m = 0;
else 
m = 1;
for (j = 1 ; j <= i ; j++)
{
System.out.println(m);
if (m == 0)
m = 1;
else
m = 0;
System.out.println(" ");
}
}
}
