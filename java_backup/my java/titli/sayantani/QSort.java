// quick sort
import java.util.*;
class QSort
{
    private int arr[];			
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        arr=new int[sc.nextInt()];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("Unsorted array");
        for(int i:arr)
        System.out.print("  "+i);
        sort(0,arr.length-1);
        System.out.println("\nSorted array");
        for(int i:arr)
        System.out.print("  "+i);
    }
    public void sort(int low,int high)
    {
        int l=low;
        int h=high;
        if(l>=h)
        return;
        int mid=arr[(low+high)/2];
        while(l<h)
        {
            while(l<h&&arr[l]<mid)		
            l++;
            while(l<h&&arr[h]>mid)		
            h--;
            if(l<h)			
            {
                int t=arr[h];
                arr[h]=arr[l];
                arr[l]=t;
            }
        }
        if(l<h) 		
        {
            int t=l;
            l=h;
            h=l;
        }
        sort(low,l);
        sort((l==low)?  l+1:l , high);
    }
}
class QSortMain    {
    public static void main(String args[])    {
        QSort obj=new QSort();
        obj.get();
    }
}        
