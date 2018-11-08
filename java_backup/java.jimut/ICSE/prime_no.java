import java.io.*;
class prime_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i,k=0;
        System.out.println("Enter a number to check whether it is a prime number or not::");
        n = Integer.parseInt(cd.readLine());
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k=1;
            }
       
        }
        if(k==0)
        {
            System.out.println("Prime number.");
        }
        else
        {
            System.out.println("Not a prime number.");
        }
}
}