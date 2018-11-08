
import java . io . *;
public class max_min_digit
{
public static void main (int n)
{
int k,j,s=0,n1,max,min;
n1=n;
max=min=n1%10;
while (n>0)
{
k=n%10;
if(k>max)
max=k;
else
if(k<min)
min=k;
n=n/10;
}
System.out.println ("Maximum & Minimum"+max+","+min);
}
}