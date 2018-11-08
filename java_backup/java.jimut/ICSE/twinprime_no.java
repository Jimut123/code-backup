import java.io.*;
class twinprime_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n1,n2,i,k=0,v=0;
        System.out.println("Enter the 1st number to check whether it is a twin prime number or not::");
        n1 = Integer.parseInt(cd.readLine());
        System.out.println("Enter the 2nd number to check whether it is a twin prime number or not::");
        n2 = Integer.parseInt(cd.readLine());
        for(i=2;i<n1;i++)
        {
            if(n1%i==0)
            {
                k=1;
            }
       
        }
        for(i=2;i<n2;i++)
        {
            if(n2%i==0)
            {
                v=1;
            }
       
        }
        if((k==0)&&(v==0))
        {
           if(Math.abs(n1-n2)==2)
           {
               System.out.println("A twin_prime number.");
           }
        else
        {
            System.out.println("Not a twin_prime number.");
        }
     }
     else
     {
           System.out.println("Not a twin_prime number.");
        }
    }
}