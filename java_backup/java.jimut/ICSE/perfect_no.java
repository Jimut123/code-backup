import java.io.*;
class perfect_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,n,n1,s=0;
        System.out.println("Enter a number::");
        n = Integer.parseInt(cd.readLine());
       
        n1=n;
       
            for(i=1;i<n1;i++)
            {
               if(n1%i==0)
               {
                   s=s+i;
               }
            }
            
       if(n==s)
       {
           System.out.println("Your number is a perfect no::"+s);
        }
        else
        {
            System.out.println("Your number is not a perfect no::"+s);
        }
    }
}