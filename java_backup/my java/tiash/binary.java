class binary
{
    void main(int n)
    {int i,j,m;
        for( i=1;i<=n;i++)
        {
            if(i%2!=0)
            m=1;
            else
            m=0;
            for( j=1;j<=5;j++)
            {
                if(m==1)
                {
                if(j==1||j==5)
                    System.out.print(1);
                    else
                    System.out.print(0);
                }
                    else
                    if(m==0)
                    {
                    if(j==1||j==5)
                    System.out.print(0);
                    else
                    System.out.print(1);
                }
                }
                System.out.println("");
            }
        }
    }
        