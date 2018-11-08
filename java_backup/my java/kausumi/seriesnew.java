class seriesnew
{
   public static void main(int n)
   {
      int i,j;
       for(i=1;i<=n;i++)
      {
          if(i==1||i==n)
           for(j=1;j<=n;j++)
             System.out.print(j+" ");
          else
          {
              for(j=1;j<=(i-1);j++)
                System.out.print(j+" ");
              for(j=1;j<=(n-i);j++)
                System.out.print("*"+" ");
              System.out.print(n);
            }
            System.out.println("");
    }
}
}
