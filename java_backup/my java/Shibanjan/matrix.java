import java.io.*;
class matrix
{
   public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,i,j;
        System.out.println("Enter the number of rows and columns");
        n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(j=n-1;j>=0;j--)
        {
        for(i=0;i<n;i++)
        System.out.print(a[i][j]);
        System.out.println();
        }
    }
}