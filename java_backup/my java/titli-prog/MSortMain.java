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
         int l=sc.nextInt();
        arr=new int[l];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("Unsorted array");
        for(int i:arr)
        System.out.print("  "+i);
        Merge_Sort(0,l-1);
        System.out.println("\nSorted array");
        for(int i:arr)
        System.out.print("  "+i);
        System.exit(0);
    }
    public void Merge_Sort(int m,int n)
    {
        if(m!=n)
        {
            int mid=(m+n)/2;
            Merge_Sort(m,mid);
            Merge_Sort(mid+1,n);
            Merge_Pass(m,mid,n);
        }
    }
    public void Merge_Pass(int top,int size,int bottom)
    {
        int temp[]=new int[1000];
        int f=top;
        int s=size+1;
        int t=top;
        int upper;
        while((f<=size)&&(s<=bottom))
        {
            if (arr[f]<=arr[s])
            {
                temp[t]=arr[f];
                f++;
            }
            else
            {
                temp[t]=arr[s];
                s++;
            }
            t++;
        }
        if (f<=size)
        {
            for(f=f;f<=size;f++)
            {
                temp[t]=arr[f];
                t++;
            }
        }
        else
        {
            for(s=s;s<=bottom;s++)
            {
                temp[t]=arr[s];
                t++;
            }
        }
        for(upper=top;upper<=bottom;upper++)
        {
            arr[upper]=temp[upper];
        }
    }
}