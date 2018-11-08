import java . io. *;
class compoundinterest
{
public static void main (int p , int r , int t)
{
int ci;
ci = p* (int)Math.pow((1+r)/100 , t);
System.out.println (" compound interest : " +ci);
}
}