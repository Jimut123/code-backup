import java.io.*;
class mirror_mat
{
    public static void main()throws IOException
    {
        int a[][],i,n,j,t,k;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter term:");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
        {   
            a[i][j]=Integer.parseInt(br.readLine());
        }
    }
    for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
        {   
            if(a[i][j]>=1 && a[i][j]<=9)
            System.out.print(a[i][j]+" "+" ");
            else
            System.out.print(a[i][j]+" ");
        }
       System.out.println("");
    }
    for(i=0;i<n;i++)
        {
         for(j=0,k=n-1;j<=n/2;j++,k--)
        {       
            t=a[i][j];
            a[i][j]=a[i][k];
            a[i][k]=t;
        }
    }
    for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
        {   
            if(a[i][j]>=1 && a[i][j]<=9)
            System.out.print(a[i][j]+" "+" ");
            else
            System.out.print(a[i][j]+" ");
        }
       System.out.println("");
    }
}
}