class pats
{
    public static void main(String args[])
    {
        int i,sp,sp1,j;
        sp=5;
        sp1=5;
               
        for(i=1;i<3;i++)
        {
          for(j=1;j<=sp;j++)  
            System.out.print(" ");
            System.out.print("*");
            for(j=1;j<=sp1;j++)
            System.out.print(" ");
            System.out.print("*");
            sp=sp+1;
            sp1=sp1-2;
            System.out.println("");
        }
        sp=sp+1;
        for(j=1;j<=sp;j++)  
            System.out.print(" ");
        System.out.print("*");
        sp=sp-1;
        sp1=1;
        System.out.println("");
        for(i=1;i<=2;i++)
        {
            for(j=1;j<=sp;j++)
            System.out.print(" ");
            System.out.print("*");
            for(j=1;j<=sp1;j++)
            System.out.print(" ");
            System.out.print("*");
            sp=sp-1;
            sp1=sp1+3;
            System.out.println("");
    }
}
}