//6857
import java.io.*;
class factor
{
  public static void main(String args[])throws IOException
  {
    long n=600851475143l;
    long d=2,a=0,m,i;
    for (i = 2; i <= n; i++)
    {
        if (n % i == 0)
        {
           n /= i;
           i--;
        }
     }
    System.out.println("Largest Prime Factor is = "+i);
  }
}