
class series4
    {
        public static void main(int n)
            {
                int i,k,j,f;
                double s=0;
                k=1;
                for(i=1;i<=n;i++)
                    {
                  f=1;
                  for(j=1;j<=(i+1);j++)
                   f=f*i;
                  s=s+f*k; 
                  k=k*-1;
                  
                }
                System.out.println(s);
            }
        }