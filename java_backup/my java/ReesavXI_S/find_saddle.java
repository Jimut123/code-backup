import java.util.*;
class find_saddle
{
    int n;
    int a[][];
    find_saddle(int s)
    {
        n=s;
        a=new int[n][n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter element ");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void calc()
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[i][j]>a[i][j+1])
                {
                    temp=a[i][j+1];
                    a[i][j+1]=a[i][j];
                    a[i][j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j][i]>a[j][i+1])
                {
                    temp=a[j][i+1];
                    a[j][i+1]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
            