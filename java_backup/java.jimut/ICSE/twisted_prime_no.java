import java.io.*;
class twisted_prime_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i,k=0,s=0,d,v;
        System.out.println("Enter a number to check whether it is a twisted prime number or not::");
        n = Integer.parseInt(cd.readLine());
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k=1;
            }
       
        }
        v=n;
        if(k==0)
        {
            k=0;
            while(v!=0)
            {
                d=v%10;
                s=(s*10)+d;
                v=v/10;
            }
            for(i=2;i<s;i++)
             {
              if(n%i==0)
             {
                  k=1;
             }
        
            }
            if(k==0)
            {
            System.out.println("Twisted_prime number.");
            }
            else
            {
                System.out.println("Not a twisted_prime number.");
            }
        }
        else
        {
            System.out.println("Not a prime number as well as twisted prime number.");
        }
    }
}