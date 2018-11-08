import java.util.*;
class reflect_mat
{
    int n;
    int a[][];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size ");
        n=sc.nextInt();
        a=new int[n][n];
    }
    void accept()
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
    void reflect_right()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void reflect_down()
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
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
    void main()
    {
        input();
        accept();
        System.out.println("Right/Left reflected");
        display();
        reflect_right();
        System.out.println("Down/Up reflected");
        display();
        reflect_down();
    }
}