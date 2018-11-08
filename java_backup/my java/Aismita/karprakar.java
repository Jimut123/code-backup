class karprakar
{
    public static void main(int n)
    {
        int dup=n;int d2=n;
        int sq=n*n;int c=0;int sum=0;
        while(n>0)
        {
            int r=n%10;
            c++;
            n/=10;
        }
        int p=(int)Math.pow(10,c);
        sum=sq%p+(int)sq/p;
        if(sum==dup)
        System.out.println("karprekar no");
        else
        System.out.println("not karprekr no.");
    }
}