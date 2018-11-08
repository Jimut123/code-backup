class Armstrong
{
    public static void main(int n)
    {
        int k,s=0,c=0,n1;
        n1=n;
        while(n>0)
        {
            c++;
            n1=n1/10;
        }
        n1=n;s=0;
        while(n1>0)
        {
            k=n1%10;
            s=s+(int)Math.pow(k,c);
            n1=n1/10;
        }
        if(s==n)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an armstrong number");
    }
}