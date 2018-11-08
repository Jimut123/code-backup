import java.io.*;
class spiral
{
   public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the number of rows and columns");
        n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        int s=1,k=0,j,i,dup=n,m=n*n;
        //for(i=0;i<n;i++)
        //{
          //  for(j=0;j<n;j++)
            //{
               // System.out.print(a[i][j]);
            //}
            //System.out.println();
        //}
        while(s<=m)
        {
            
            for(i=0;i<n;i++)
            {
                a[k][i]=s++;
                System.out.print(a[k][i]+" ");
            }
            for(i=n-1;i>=k;i--)
            {
                s=s+1;
                a[i][n-1]=s;
            }
            for(i=n-1;i>=k;i--)
            {
                s=s+1;
                a[n-1][i]=s;
            }
            for(i=n-1;i>=k;i--)
            {
            s=s+1;
            a[i][k]=s;
            }
            k=k+1;
            n=n-1;
        }
        for(i=0;i<dup;i++)
        {
            for(j=0;j<dup;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}