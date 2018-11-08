
class series
    {
        int n,i;
        void input(int n)
        {
           
            print(n);
        }
        void print(int n)
        {
            int j;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                System.out.print(j);
                for(j=(i-1);j>=1;j--)
                System.out.print(j);
                System.out.println("");
            }
        }
    }
            