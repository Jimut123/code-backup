class febonacci

    {
        int n;
        void input(int n)
            {
                febo(n);
                
            }
        void febo(int n)
            {
                int a=0;
                int b=1;
                int s,i;
                System.out.print(a+","+b+",");
                for(i=1;i<=n-2;i++)
                    {
                        s=a+b;
                        System.out.print(s+",");
                        a=b;
                        b=s;
                    }
                }
            }