import java.io.*;
class srt
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no.");
        int n=Integer.parseInt(in.readLine());
        int a[][]=new int[n][n];
        int i,j,k;
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        a[i][j]=Integer.parseInt(in.readLine());
        System.out.println("Initial arrray");
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        System.out.print(a[i][j]);
        System.out.println();
       }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(a[i][k]<a[i][j])
                    {
                        int t=a[i][j];
                        a[i][j]=a[i][k];
                        a[i][k]=t;
                    }
                }
            }
        }
          System.out.println("Final arrray");
        for(i=0;i<n;i++)
        {
        for(j=0;j<n;j++)
        System.out.print(a[i][j]);
        System.out.println();
       }
    }
}
        
            