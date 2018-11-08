import java.io.*;
class composite_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,n,s=0;
        System.out.println("Enter a number::");
        n = Integer.parseInt(cd.readLine());
      for(i=2;i<n;i++)
            {
               if(n%i==0)
               {
                   s=s+1;
               }
            }
            
       if(s>0)
       {
           System.out.println("Your number is a composite no.");
        }
        else
        {
            System.out.println("Your number is not a composite no.");
        }
    }
}