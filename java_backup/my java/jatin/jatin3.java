class jatin3
    {
        public static void main(int n)
            {
                int i,j,k,s=0;
                j=n;
                while(j>0)
                {
                             
                                k=j%10;
                                s=s+(k*k*k);
                                j=j/10;
                            }
                          
                        if(s==n)
                        System.out.println("armstong"+n);
                        else
                        System.out.println ("notarmstong"+n);
                        
                        
                    }
                }
                
                            