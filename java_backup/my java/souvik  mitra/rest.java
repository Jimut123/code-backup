class rest
{
    public static void main(String args[])
    {
        int n, h,i,f,k,j;
        for(i=100;i<=999;i++)
        {
            int d;int s=0;
            j=i;
            while(j>0)
            {
                 k=j%10;
                f=1;
                for( n=1;n<=k;n++)
                f=f*n;
                s=s+f;
                j=j/10;
            }
                if(s==i)
                System.out.println(i);
            }
        }
        
    }

