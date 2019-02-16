//1143333321666668
//1493333266666668
import java.io.*;
class multiple
{
  public static void main(String args[])throws IOException
  {
    long i,sum=0;
    for(i=1;i<80000000;i++)
      if((i%3==0) || (i%5==0))
        sum=sum+i;
    System .out.println("Sum is = "+sum);
  }
}