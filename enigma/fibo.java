//19544084
import java.io.*;
class fibo
{
  public static void main(String args[])throws IOException
  {
    long a=0,b=1,c=0,sum=0;
    while(a<40000000)
    {
      c=a+b;
      if(a%2==0)
       sum=sum+a;
      a=b;
      b=c;
    }
    System.out.println("Sum is = "+sum);
  }
}