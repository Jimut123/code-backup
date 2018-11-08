class series
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            if(i>1)
            {
                for(int k=i-1;k>=1;k--)
                {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
