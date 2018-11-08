import java.io.*;
class dig_below
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int n,a[][],i=1,j=0;
    void insert()throws IOException
    {
        System.out.println("Enter the dimensions");
        n=Integer.parseInt(in.readLine());
        a=new int[n][n];
        check1(i,j);
        check2(n,i);
    }
    void check1(int i,int j)
    {
        if(j>=i)
        return;
        else
        a[i][j]=1;
        check1(i,j+1);
    }
    void check2(int n,int i)
    {
        if(i>=n)
        return;
        else
        {
            check1(i,j);
            check2(n,i+1);
        }
    }
    public void main()throws IOException
    {
        insert();
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<n;c++)
            {
                System.out.print(a[r][c]+"  ");
            }
            System.out.println();
        }
        
    }
}

    
    