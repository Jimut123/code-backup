class Number
{
    public static void main(int n)
    {
        int n1=1,f,k,j,s=0;
        while(n>0)
        {
            k=n1%10;
            f=1;
            for(j=1;j<=k;j++)
            {
                f=f*j;
                s=s+f;
                n1=n/10;
            }
            if(s==n)
            System.out.println("krishnamurty number");
            
            else
            System.out.println("not a krishnamurty number");
        }
    }
}