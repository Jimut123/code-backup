//2329089562800
//26771144400
import java.io.*;
class small
{
  public long gcd(long a,long b)
  {
     if(a%b != 0)
       return gcd(b,a%b);
     else
       return b;
  }
  public long lcm(long n)
  {
     long a=1,i;
     for(i=1;i<=n;i++)
       a=(a*i)/(gcd(a,i));
     return a;
  }
  public static void main(String args[])throws IOException
  {
     long n=30;
     small obj = new small();
     System.out.println("The number is = "+obj.lcm(n));
  }
}   