


 class pythagoriantriplet
{
    public static void main(int n)
    {
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            for(k=1;k<=n;k++)
            if((i*i)==((j*j)+(k*k)))
            {
                System.out.println(i+","+j+","+k);
            }
        }
    }
        }
 

