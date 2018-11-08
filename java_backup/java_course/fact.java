class fact
{
    int i,f,n1;
    fact(int n)
    {
        f=1;
        n1=n;
    }
    void fact()
    {
        for(i=1;i<=n1;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}