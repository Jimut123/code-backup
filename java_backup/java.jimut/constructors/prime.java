public class prime
{
    int n;
    prime()
    {
        n=0;
    }
    public void input(int x)
    {
        n=x;
    }
    public void display()
    {
        int i,f=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
            
        }
        if(f==0)
             System.out.println(n+"is a prime number");
             else
             System.out.println(n+"is not a prime number");
            }
    }