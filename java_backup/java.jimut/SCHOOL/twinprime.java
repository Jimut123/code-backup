import java.io.*;
class twinprime
{
    int i,x=1,c;
    int primecheck(int n)
    {
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                x=0;
            }
        }
        if(x==1)
        {
            return(1);
        }
        else
        {
            return(2);
        }
    }
    void prime(int j,int k)throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        for(c=j;c<=k;c++)
        {
            if( primecheck(c)==1)
            {
                System.out.println(c);
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        twinprime ob = new twinprime();
        System.out.println("Enter the first number:");
        int m =Integer.parseInt(cd.readLine());
        System.out.println("Enter the second number, assume that it is greater than the first one:");
        int n =Integer.parseInt(cd.readLine());
        ob.prime(int m ,int n);
    }
}
        
        
        