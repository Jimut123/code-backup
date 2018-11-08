import java.io.*;
class mirror_matrix
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int r,c,i,j;
        System.out.println("Enter the number of rows and columns:");
        r=Integer.parseInt(cd.readLine());
        c=Integer.parseInt(cd.readLine());
        int n[][]=new int[r][c];
        System.out.println("Enter the numbers:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                n[i][j]=Integer.parseInt(cd.readLine());
            }
        }
        int a[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[r-1-i][j]=n[i][j];
            }
        }
         for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
             System.out.println();
        }
    }
}