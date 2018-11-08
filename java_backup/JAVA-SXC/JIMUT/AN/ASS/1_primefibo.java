// prime fibo nos.
import java.io.*;
class fibo
{
    int isPrime(int n) // 0 for not prime and 1 for prime
    {
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
                return 0;
            
        }
        return 1;
    }
    int isFibo(int n)
    {
        int i,c=0,a=1,b=1;
        for(i=0;i<n;i++)
        {
            c=a+b;
            if(c==n)
                return 1;
            a=b;
            b=c;
        }
        return 0;
    }
}

class primeFibo
{
    public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
                fibo ob = new fibo();
                int i,n;
                //System.out.println(ob.isPrime(7));
                //System.out.println(ob.isFibo(8));
                System.out.println("\n Enter a number : (0-2000)");
                n = Integer.parseInt(cd.readLine());
                for(i=0;i<n;i++)
                {
                    if(ob.isFibo(i)==1 && ob.isPrime(i)==1)
                        System.out.print(i+" ");
                }

        }
}
