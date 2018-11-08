
class lcm_hcf
    {
        int a, b, k,d;
        void input(int a,int b)
            {
                k=lcm(a, b);
                System.out.println("lcm" +k);
                k=cal(a,b);
                System.out.print("hcf" +k);
            }
            int lcm(int a,int b)
            {
                 
            int i=1;
            while((a*i)%b !=0)
            i++;
            return(a*i);
        }
        int cal(int a,int b)
                {
                    int c,d,k;
                    if(a>b)
                        {
                            c=a;
                            d=b;
                        }
                    else
                        {
                            c=b;
                            d=a;
                        }
                    while(c%d !=0)
                        {
                            k=c%d;
                            c=d;
                            d=k;
                        }
                        return d;
                    }
                }
                
                