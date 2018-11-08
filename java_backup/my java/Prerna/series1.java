class series1
{
    public static void main(String args[])
    {
        int i,j,m,a=97,sp=0,k=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=k;j++)
            System.out.print((char)a);
            for(m=1;m<=sp;m++)
            System.out.print(" ");
            a++;
            for(j=j-1;j>=1;j--)
            System.out.print((char)a);
            a++;
            sp=sp+2;
            k=k-1;
            System.out.println("");
        }
    }
}      
       