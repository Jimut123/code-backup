
import java.io.*;
public class a
{
public static void main(String args[])
         throws IOException 
{
int a;
InputStreamReader isr= new InputStreamReader(System.in);

BufferedReader br= new BufferedReader(isr);
 
      a=Integer.parseInt(br.readLine());
      if(a/2==0)
      System.out.print("Even"+a);
      else
      System.out.print("odd"+a);
    }
}
         

