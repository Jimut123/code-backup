class prime
{
    int a,b,i,j,k;
    prime()
    {
        a=1;
        b=100;
    }
    void start()
    {
        for(i=a;i<=b;i++)
        {
            k=primecheck(i);
            if(k==0)
            System.out.println(i);
        }
    }
    int primecheck (int x)
    {
        int f=0;
        for (j=2;j<x;j++)
        {
            if(x%j==0)
            {
                f=1;
                break;
            }
            
        }
        return f;
    }
    class b
    {
        public void main(String args[])
        {
            prime a1=new  prime();
            a1.start();
        }
    }
}
