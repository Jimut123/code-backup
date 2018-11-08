import java.io.*;
class array
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limit of array");
        int n=Integer.parseInt(in.readLine());
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        for(int r=0;r<n;r++)
        for(int c=0;c<n;c++)
        a[r][c]=Integer.parseInt(in.readLine());
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"  ");
            System.out.println();
        }
        int m=0; int p=0;
        for(int j=0;j<n;j++)
        {
        for(int i=n-1;i>=0;i--)
        
            
            {
                b[m][p]=a[i][j];
                System.out.print(b[m][p]+"  ");
                m++;
            }
            p++;m=0;
            System.out.println();
            
        }
    }
}
                
    