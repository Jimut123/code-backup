
import java.io.*;
class prime
{
    public static void main (String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader (System.in);
         BufferedReader cd = new BufferedReader(ab);
         System.out.println("Enter a number::");
         int x = Integer.parseInt(cd.readLine());
         int c=1;
           for(int i=2;i<x;i++)
          {
            if(x%i==0)
            {
                c=0;
            }
        }
        if(c == 1)
        {
         System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}
      
            
            