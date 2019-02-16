//116461
//128201
import java.io.*;
class prime
{
  public boolean isPrime(long n)
  {
     for(long i=2;i<n;i++)
       if(n%i==0)
         return false;
     return true;
  }
  public static void main(String args[])throws IOException
  {
    long j,c,n=11001;
    prime obj = new prime();
    for(j=2,c=0;c<n;j++)
      if(obj.isPrime(j))
        ++c;
    System.out.println("The 11001th prime number is = "+(j-1));
  }
}