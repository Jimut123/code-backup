//insertion sort
import java.util.*;
class ISort
{
    private int arr[];			
    private int n;			
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        n=sc.nextInt();
        arr=new int [n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.print("Unsorted array");
        for(int i : arr) 			
        System.out.print("  "+i);
        System.out.print("\n Sorted array");
        sort();
        for(int i : arr)			
        System.out.print("  "+i);
    }


    public void sort()
    {
        int i=0,j=0;
        for(i=1;i<n;i++)
        {
            int t=arr[i];
            j=i;
            while(j>0&&arr[j-1]>t)			
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=t;
        }
    }
}

class ISortMain
{
    public static void main(String args[])
    {
        ISort obj=new ISort();
        obj.get();
    }
}
