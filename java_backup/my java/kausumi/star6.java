

 class star6
{
  public static void main(int n)
  {
      int i,j,k,l;
      for(i=n;i>=1;i--)
      {
          for(j=i;j>=1;j--)
          System.out.print("*");
          System.out.println(" ");
        }
        for(k=2;k<=n;k++)
        {
            for(l=1;l<=k;l++)
            System.out.print("*");
            System.out.println(" ");
        }
    }
}
