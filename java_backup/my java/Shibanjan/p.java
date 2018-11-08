import java.io.*;
class program5
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  double x,y,c=0,fact=1,i,j,power;
  double s=0.0000;
  void input()throws IOException
  {
      System.out.println("Enter x");
      x=Integer.parseInt(br.readLine());
      System.out.println("Enter Y");
      y=Integer.parseInt(br.readLine());
  }
  void funct()
  {
      for(i=0;i<y;i++)
      {
          c++;
          power=(int)Math.pow(x,c);
          for(j=1;j<=c;j++)
          {
              fact=fact*j;
          }
          if(c%2==0)
          {
              s=s-(power/fact);
              System.out.print("-{("+x+"^"+c+"}/"+fact+")");
          }
          else
          {
          s=s+(power/fact);
          System.out.print("+{("+x+"^"+c+"}/"+fact+")");
          }
          fact=1;
      }
      System.out.println("="+s);
      
  }
  public static void main(String args[])throws IOException
  {
      program5 s=new program5();
      s.input();
      s.funct();
    }
}
/**
 * Write a description of class p here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class p
     */
    public p()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
