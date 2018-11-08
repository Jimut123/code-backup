import java.io.*;
class sum_of_digits
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s=0,k;
        System.out.println("Enter a number to check the sum::");
        n = Integer.parseInt(cd.readLine());
        
        while(n!=0)
        {
            k=n%10;
            s=s+k;
            n=n/10;
        }
        
            System.out.println("Your number's sum is:"+s);
       
    }
}