import java.io.*;
public class danger
{
    public static void main(String args[])throws IOException
    {
        int a[][];int b[][];int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of rows and coloumns");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];b=new int[n][n];int i,j,k;k=0;
        System.out.println("enter the elemnts into the maTRTIX");
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
                System.out.println(a[i][j]);
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]!=a[i][i])
                {
                    k=a[i][j];
                    a[i][j]=b[j][i];
                    b[j][i]=k;
                }
                System.out.println(b);
            if(a[i][j]==a[i][i])
            {
                b[i][j]=a[i][j];
            }
            System.out.println(a[i][j]);
        }
    }
}
}
        
