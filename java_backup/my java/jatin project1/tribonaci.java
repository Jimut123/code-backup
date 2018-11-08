class tribonaci
    {
        public static void main (int n)
            {
                
                int a=0;
                int b=1;
                int c=2;
                int s,i;
                System.out.print(a+","+b+","+c+",");
                for(i=1;i<=n-3;i++)
                    {
                        s=a+b+c;
                        System.out.print(s+",");
                        a=b;
                        b=c;
                        c=s;
                    }
                }
            }