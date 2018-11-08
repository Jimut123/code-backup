import java.io.*;
class automorphic_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,sq,d,s=0,p,m;
        System.out.println("Enter a number to check whether it is an automorphic number or not::");
        n = Integer.parseInt(cd.readLine());
        sq=n*n;
        m=n;
        while(n!=0)
        {
            d=n%10;
            s=s+1;
            n=n/10;
        }
        p=sq%(int)Math.pow(10,s);
        if(p==m)
        {
            System.out.println("Your number is an automorphic number.");
        }
        else
        {
             System.out.println("Your number is not an automorphic number.");
            }
        
            
    }
}