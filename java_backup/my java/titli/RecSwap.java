//swapping diagonals using recursion
import java.util.*;
class RecSwap
{
   int a[][];
   Scanner sc=new Scanner(System.in);
   int n;
   public void get()
   {
       int i,j;
       System.out.println("enter order of matrix");
        n=sc.nextInt();
       a=new int[n][n];
       for(i=0;i<n;i++)
       {
           for(j=0;j<n;j++)
           {
               System.out.println("enter a no.");
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original matrix : ");
        display();
        swap(0);
        System.out.println("matrix after swapping : ");
        display();
    }
    public void swap(int i)
    {
        int l=n-1;
        if (i>l)
         return;
        int temp=a[i][i];
        a[i][i]=a[i][l-i];
        a[i][l-i]=temp;
        swap(i+1);
    }
    public void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}