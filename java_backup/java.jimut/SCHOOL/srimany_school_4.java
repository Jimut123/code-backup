import java.io.*;
class srimany_school_4
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
         int i,j,k,n,l;
          System.out.println("\f ");
          System.out.println("Enter the number of terms:: ");
          n = Integer.parseInt(cd.readLine());
          System.out.println("\f ");
          k=n-1;
           for(i=1;i<=n;i++)
        {
            
                for(l=1;l<=k;l++)
           {
             System.out.print("  ");
           }
         
                for(j=1;j<=i;j++)
           {
             System.out.print(j+" ");
           }
           
                for(j=i-1;j>=1;j--)
           {
             System.out.print(j+" ");
           }
           System.out.println();
           k=k-1;
        }
        k=k+2;
        
        
          for(i=n-1;i>=1;i--)
        {
            
               for(l=1;l<=k;l++)
           {
             System.out.print("  ");
           }
         
                for(j=1;j<=i;j++)
           {
             System.out.print(j+" ");
           }
           
                for(j=i-1;j>=1;j--)
           {
             System.out.print(j+" ");
           }
           System.out.println();
           k=k+1;
        }
        
        
    }
}
      