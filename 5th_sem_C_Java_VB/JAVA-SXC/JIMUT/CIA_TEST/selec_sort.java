// To calculate the file sizes of the files inputed as arguments in java
import java.io.*;
class selec_sort
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i;
        System.out.println("\n Enter the total no. of elements present and to be sorted : ");
        n=Integer.parseInt(cd.readLine());
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("\n Enter the "+(i+1)+" th element : ");
            arr[i] = Integer.parseInt(cd.readLine());
        }
        selec_sort ob = new selec_sort();
        ob.selection_sort(arr);
    }
    void selection_sort(int a[])
    {
        int i,j,k=0,min=a[0],t,l;
        for(i=0;i<a.length-1;i++)
        {
            min = a[i];
            for(j=i+1;j<a.length;j++)
            {
                if(min>=a[j])
                {
                    min = a[j];
                    k=j;
                }
            }
            t=a[i];
            a[i] = min;
            a[k]=t;
            System.out.println("\narray after "+(i+1)+" pass :");
            for(l=0;l<a.length;l++)
            {
                System.out.print(a[l]+" ");
            }
        }
        System.out.println("\n Sorted array : ");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
