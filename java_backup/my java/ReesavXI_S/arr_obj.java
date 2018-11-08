import java.util.*;
class arr_obj
{
    int n;
    int a[][];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array ");
        n=sc.nextInt();
        a=new int[n][n];
    }
    void initialize()
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
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    arr_obj multi(arr_obj b,arr_obj a1)
    {
        arr_obj c=new arr_obj();
        c.input();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=0;
                for(int k=0;k<n;k++)
                {
                    sum=sum+(a1.a[i][k]*b.a[k][j]);
                }
                c.a[i][j]=sum;
            }
        }
        return c;
    }
    void main()
    {
        arr_obj a1=new arr_obj();
        arr_obj b=new arr_obj();
        a1.input();
        a1.initialize();
        b.input();
        b.initialize();
        System.out.println("Array A ");
        a1.display();
        System.out.println("Array B ");
        b.display();
        arr_obj d=new arr_obj();
        d=b.multi(b,a1);
        System.out.println("Final Array ");
        d.display();
    }
}