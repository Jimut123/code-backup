import java.io.*;
class magic
{
    public static void main(String ar[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the limits");
        int n=Integer.parseInt(in.readLine());
        int a[][]=new int[n][n];
        for(int r=0;r<n;r++)
        for(int c=0;c<n;c++)
        a[r][c]=0;
        int i=0,j=n/2,k=1;
        while(k<=n*n)
        {
            a[i][j]=k++;
            i--;j++;
             
            if(i<0 && j<n)
            i=n-1;
            else
            if(i<0 && j>n-1)
            {
                i+=2;
                j--;
            }
            else
            if(j>n-1)
            j=0;
            else
            if(a[i][j]>0)
            {
                i+=2;
                j--;
            }
           
            
            
        }
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            System.out.print(a[r][c]+"  ");
            System.out.println();
        }
    }
}