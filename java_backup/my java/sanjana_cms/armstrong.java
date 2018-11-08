import java.io.*;
class armstrong
{
    public static void main (int n) throws IOException
    {
        int i,s,n1,k;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a number");
        s=100; 
        n1=n;
        while(n1>=1000)
        {
            k=n1%10;
            s=s+(k*k*k);
            n1=n1%10;
        }
        if (s==n)
        System.out.println("Armstrong number");
        else
        System.out.println("Non-Armstrong number");
    }
}