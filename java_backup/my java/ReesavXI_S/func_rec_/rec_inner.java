package func_rec_;
import java.util.*;
class rec_inner
{
    int n;
    int a[][];
    int b[];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side");
        n=sc.nextInt();
        a=new int[n][n];
        b=new int[n*2];
    }
    void inputArr()
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
    void diag(int k,int n,int j)
    {
        if(k==n)
        return;
        else
        {
            b[j]=a[k][k];
            b[++j]=a[k][n-k-1];
            diag((k+1),n,(j+1));
        }
    }
    void calc()
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                c=0;
               for(int k=0;k<(n*2);k++)
               if(a[i][j]==b[k])
               c=1;
               if(c==1)
               System.out.print("  ");
               else
               if(a[i][j]%100==0)
                System.out.print(a[i][j]+" ");
               else
               System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    void main()
    {
        rec_inner ri=new rec_inner();
        ri.input();
        ri.inputArr();
        ri.diag(0,n,0);
        ri.calc();
    }
}
        