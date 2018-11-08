import java.io.*;
class pattern
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i,j;
        String c1,c2,c3;
        System.out.println("Enter the order of n : ");
        n=Integer.parseInt(cd.readLine());
        System.out.println("Enter the three characters : ");
        c1=(cd.readLine());
        c2=(cd.readLine());
        c3=(cd.readLine());
        String a[][]=new String[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j||(i+j)==n-1)
                a[i][j]=c3;
                else
                a[i][j]=c2;
            }
        }
        for(i=0;i<n/2;i++)
        {
            for(j=i+1;j<n-i-1;j++)
            {
                a[i][j]=c1;
                a[n-1-i][j]=c1;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
         }
        }
    }