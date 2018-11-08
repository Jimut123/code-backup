class digits extends number
{
    int x,n,a,s,i;
    void data(int n)
    {
        x=n;
    }
    void cal()
    {
        i=0;s=0;a=0;
        for(i=x;i>0;i=i/10)
        {
            a=i%10;
            s=s+a;
        }
        System.out.println("the sum "+s);
    }
}