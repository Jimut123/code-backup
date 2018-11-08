import java.io.*;
class sum_matrix
{
    int mat[][]=new int[50][50];
    int m,n,i,sr=0,sc=0,j;
    sum_matrix()
    {
        m=0;
        n=0;
        for(i=0;i<50;i++)
        {
            for(j=0;j<50;j++)
            {
                mat[i][j]=0;
            }
        }
    }
    void read_row_column(int x,int y)
    {
        m=x;
        n=y;
    }
    void readmatrix()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter the elements of the matrix : ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the element of  "+i+" th row and "+j+" th column :");
                mat[i][j]=Integer.parseInt(cd.readLine());
            }
        }
    }
    void show_mat()
    {
        System.out.println("Enter the elements of the matrix are : ");
        for(i=0;i<m+1;i++)
        {
            for(j=0;j<n+1;j++)
            {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void summatrix()
    {
        if(m>n)
        {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sr=sr+mat[i][j];
                sc=sc+mat[j][i];
            }
            mat[i][m]=sr;
            mat[m][i]=sc;
            sr=0;
            sc=0;
        }
       }
       else
       {
           for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sr=sr+mat[j][i];
                sc=sc+mat[i][j];
            }
            mat[i][m]=sr;
            mat[n][i]=sc;
            sr=0;
            sc=0;
        }
        }
    }
    public static void main(String args[])throws IOException
    {
        int r,c;
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        sum_matrix ob = new sum_matrix();
        System.out.println("Enter the no. of rows and columns : ");
        r=Integer.parseInt(cd.readLine());
        c=Integer.parseInt(cd.readLine());
        ob.read_row_column(r,c);
        ob.readmatrix();
        ob.summatrix();
        ob.show_mat();
    }
}
        