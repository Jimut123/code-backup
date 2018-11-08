import java.io.*;
class saddle
{
   public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0,q=0,p=0;int c=0;
        System.out.println("Enter the number of rows and columns");
        n=Integer.parseInt(br.readLine());
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
           
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        for(int j=0;j<n;j++)
        {
            int max=0;
            for(int i=0;i<n;i++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                    p=i;q=j;
                }
            }
            int min=100;
            for(int k=0;k<n;k++)
            {
                if(a[p][k]<min)
                {
                    min=a[p][j];
                    s=k;
                }
            }
            if(q==s)
            {
                c++;
                break;
            }
        }
        if(c>0)
    System.out.println("Saddle point present at "+p+" , "+s+" position");
}
    }
   // if(c>0)
 //   System.out.println("Saddle point present at "+i+" , "+j+" position");
