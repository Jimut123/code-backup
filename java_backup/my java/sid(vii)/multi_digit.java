class multi_digit
{
    public static void main (int n)
    {
        int f=0;
        for (int j=2;j<n;j++)
        {
            if (n%j==0)
            {
                f=1;
                break;
            }
        }
            if (f==0)
            {
                int n1=n,p=1;
                int s,f1,k;
                s=0;
                while (n1>0)
                {
                    p=n1%10;
                    f1=1;
                    for(k=1;k<=p;k++)
                    f1=f1*k;
                    s=s+f1;
                    n1=n1/10;
                }
                    
              System.out.println(s);  
            }
        }
        
    }
