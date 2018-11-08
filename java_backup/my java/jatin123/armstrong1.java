class armstrong1
{
    int n1,s,n2,k,c;
    armstrong1()
    {
      n1=0;
      s=0;
        
    }
    void input(int n)
    {
        n1=n;
        check(n1);
        
    }
    void check(int n1)
    {
        n2=n1;
        k=0;
        c=digcount(n1,k);
        if(n1==arm(n1,c,s))
        System.out.println("Armstrong....");
        else
        System.out.println("Non Armstrong....");
    }
    int digcount(int n1,int k)
    {
        if(n1<=0)
        return k;
        else
        return(digcount(n1/10,k+1));
    }
    int arm(int n1,int c,int s)
    {
        int k1;
        if(n1<=0)
        return s;
        else
        {
         k1=power(n1%10,c);
         s=s+k1;
         return(arm(n1/10,c,s));
        }
    }
    int power(int n1, int c)
    {
        if(c==1)
         return n1;
        else
        return(n1*power(n1,c-1));
    }
}
    