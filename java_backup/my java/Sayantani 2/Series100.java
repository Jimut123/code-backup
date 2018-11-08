class Series100
{ 
    public static void main()
    {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            System.out.print("@");
            System.out.println();
        }
        for(int k=9;k>=1;k--)
        {
         for(int l=9;l>=k;l--)  
         {
          System.out.print("N");
            System.out.println();
        }   
        }
    }
}