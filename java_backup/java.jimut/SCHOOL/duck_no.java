import java.io.*;
class duck_no
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n1,n,x=1,d;
        System.out.println("Enter a number to check whether it is a duck number or not::");
        n1 = Integer.parseInt(cd.readLine());
        n=n1;
        while(n!=0)
        {
            d=n%10;
            if(d==0)
            {
                x=0;
            }
            n=n/10;
        }
        if(x==0)
        {
            System.out.println("Your number is a duck number.");
        }
        else
        {
            System.out.println("Your number is not a duck number.");
        }
    }
}