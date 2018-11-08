class pattern
{
    public static void main ()
    {  
        int s,i,k,j,n;
        n=4;
        s=15;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=s;k++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(j+" ");
            for(j=i-1;j>=1;j--)
            System.out.print(j+" ");
            System.out.println("");
            s=s-2;
        }
        s=s+4;
        for(i=n-1;i>=1;i--)
        {
            for(k=1;k<=s;k++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(j+" ");
            for(j=i-1;j>=1;j--)
            System.out.print(j+" ");
            s=s+2;
            System.out.println("");
        }
    }
}