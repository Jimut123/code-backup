import java.io.*;
public class fibonacci
{
   public static void main(String args[]) throws IOException
   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a = 0,b = 1,c;
      System.out.println("ENTER THE LIMIT:");
      int input = Integer.parseInt(br.readLine());
      System.out.println();
      fibonacci abc = new fibonacci();
      abc.calculate(input);
   }
   public void calculate(int input)
   {
      int a = 0,b = 1,c,i = 1;
       while(i<=input)
      {
          if(i==1)
          {
              System.out.print(a+",");
          }
          else if(i == 2)
          {
              System.out.print(b+",");
          }
          else
          {
              c = a + b;
              System.out.print(" "+c+",");
              a = b;
              b = c;
          }
          i++;
      }
     System.out.println("!!!!   THANK YOU  !!!!");
   }
}
