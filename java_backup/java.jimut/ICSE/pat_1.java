class pat_1
{
    public static void main(String args[])
    {
        int i,m=64,j;
        System.out.println("\f");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                m++;
                System.out.print((char)m);
            }
            System.out.println("");
        }
    }
}