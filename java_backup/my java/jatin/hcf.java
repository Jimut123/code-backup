class hcf
    {
        int a,b,k;
        void input(int a,int b)
            {
                k=cal(a,b);
                System.out.print("hcf"+k);
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
                
                   
                            
                           