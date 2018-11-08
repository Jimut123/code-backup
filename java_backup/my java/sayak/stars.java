


public class stars
{
   public static void main(int n)
   {
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           System.out.print("*");
            System.out.println(" ");
        }
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println(" ");
        }
    }
}