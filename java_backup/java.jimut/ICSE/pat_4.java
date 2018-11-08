class pat_4
{
    public static void main(String args[])
    {
        int i,j,m=1;
        System.out.println("\f");
        for(i=0;i<=4;i++)
        {
            for(j=1;j<=m;j++)
            {
              
                System.out.print(((j*10)+i)+" ");
            }
            m++;
            System.out.println("");
        }
    }
}