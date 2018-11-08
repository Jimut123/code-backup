//M Sort
import java.util.*;
class MSortMain
{
    public static void main(String args[])
    {
        MSort obj=new MSort();
        obj.get();
    }
}

//

class MSort
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
        System.exit(0);
    }
    public void sort(int low,int high)
    {
        if(low>=high)
        return;
        int mid=(low+high)/2;
        sort(low,mid);						
        sort(mid+1,high);					
        int endLow=mid;
        int startHigh=mid+1;
        while(endLow>=low&&startHigh<=high)
        {
            if(arr[low]<arr[startHigh])
            low++;
            else
            {
                int t=arr[startHigh];
                for(int i=startHigh-1;i>=low;i--)
                arr[i+1]=arr[i];
                arr[low]=t;
                low++;
                startHigh--;
            }
        }
    }
}
