class pat_2
{
    public static void main(String args[])
    {
        int i,k,l,j;
        System.out.println("\f");
        for(i=1;i<=5;i++)
        {
            for(j=(5-i);j>=1;j--)
            {
              
                System.out.print(" ");
            }
            for(l=i;l>=1;l--)
            {
              
                System.out.print(l);
            }
            for(k=2;k<=i;k++)
            {
              
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}