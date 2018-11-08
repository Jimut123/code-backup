import java.util.*;
class pascal
{
    int a[][];
    int n;
    pascal(int s)
    {
        n=s;
        a=new int[n][n];
    }
    void clac()
    {
        a[0][0]=1;
        a[1][0]=1;
        a[1][1]=1;
        for(int i=2;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0)
                a[i][j]=1;
                else
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }
        }
    }
    void print()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=0)
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void main()
    {
        clac();
        print();
    }
}