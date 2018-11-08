class pat_3
{
    public static void main(String args[])
    {
        int i,k,m=5,j;
        System.out.println("\f");
        for(i=1;i<=5;i++)
        {
            for(j=(5-i);j>=1;j--)
            {
              
                System.out.print(" ");
            }
            for(k=5;k>=m;k--)
            {
              
                System.out.print(k);
            }
            m--;
           
            System.out.println("");
        }
    }
}