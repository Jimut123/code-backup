class armstong
    {
        public static void main ()
            {
               int i,j,k,s=0;
               j=0;
                for(i=100;i<=999;i++)
                {
                    j=i;
                    s=0;
                    while(j>0)
                    {
                        k=j%10;
                        s=s+(k*k*k);
                        j=j/10;
                    }
               
                if(s==i)
                    System.out.println("armstong"+i);
            
            }
        }
    }
                    