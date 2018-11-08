
public class try2
{
    

   public static void main(String args[])
   {
       int k=5;
       
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=k;j++)
           System.out.print(j);
           System.out.println(" ");
           for(int j=k;j>=1;j--)
            System.out.print(j);
           k--;
           System.out.println(" ");
        }
    }
}
              