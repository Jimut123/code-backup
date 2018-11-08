import java.util.*;
class diag_sort
{
    int n;
    int a[][];
    diag_sort(int s)
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
                System.out.print("Enter a number ");
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
    void diag_sort()
    {
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j][j]>a[j+1][j+1])
                {
                    temp=a[j][j];
                    a[j][j]=a[j+1][j+1];
                    a[j+1][j+1]=temp;
                }
            }
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size ");
        int n=sc.nextInt();
        diag_sort obj=new diag_sort(n);
        obj.input();
        System.out.println("The Original Matrix ");
        obj.display();
        obj.diag_sort();
        System.out.println("Matrix After Sort ");
        obj.display();
    }
}