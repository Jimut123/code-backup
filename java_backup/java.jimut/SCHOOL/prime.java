import java.io.*;
class prime
{
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    int x1 = 0,i,m,n;
    void input()throws IOException
    {
        System.out.println("Enter the first number:");
        m =Integer.parseInt(cd.readLine());
        System.out.println("Enter the second number, assume that it is greater than the first one:");
        n =Integer.parseInt(cd.readLine());
    }
    boolean isprime(int x)
    {
        for(i=2;i<2;i++)
        {
            if(x%2==0)
            {
                x1 = 1;
            }
            
        }
            if(x1 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        
    }
    void twinprime()
    {
        for(i=m;i<=n-2;i++)
        {
            if((isprime(i) == true)&&(isprime(i+2)==true))
            {
                System.out.println(i+" ");
            }
        }
    }
    public static void main (String args[])throws IOException
    {
        prime ob = new prime();
        ob.input();
        ob.twinprime();
    }
}
                
            
    