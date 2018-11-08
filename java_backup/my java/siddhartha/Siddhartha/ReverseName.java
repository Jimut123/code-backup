import java.io.*;
import java.lang.*;
public class ReverseName
{
  public static void main()throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your first name :");
    String fn=br.readLine();
    int len=fn.length();
    int i=0;
    System.out.print ("Your name in reverse : ");
    for(i=len;i>0;i--)
    {
      char f=fn.charAt((i-1));
      System.out.print (f);
      
    }
  }
}