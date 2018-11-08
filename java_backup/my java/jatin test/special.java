
class special
    {
        public static void main()
        {
            int i,j,k,t,f=1,s=0;
            for(i=100;i<=999;i++)
                {
                    j=i;
                    s=0;
                    while(j>0)
                        {
                         k=j%10;
                         f=1;
                         for(t=1;t<=k;t++)
                            {
                            f=f*t;
                        }
                            s=s+f;
                            j=j/10;
                        }
                    
                    if(s==i)
                    System.out.println(s);
                }
            }
        }
    