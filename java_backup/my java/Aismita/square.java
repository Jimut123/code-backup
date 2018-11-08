class square
{
 public static void main(int n)
 {int s=n;
     for(int i=n;i>=1;i--)
     {
         int s1=s;
         for(int j=1;j<=n-i;j++)
         {
             System.out.print("*");
            }
             for(int k=1;k<=i;k++)
          {
              System.out.print(s1);s1--;
            }
            s--;
            System.out.println("");
        }
    }
}