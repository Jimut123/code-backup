import java.io.*;
class quicksort 
{ 
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    quicksort ob = new quicksort();
    int n,i;
    System.out.print("Enter size of array : ");
    n=Integer.parseInt(br.readLine());
    int a[] = new int[n];
    System.out.println("Enter "+n+" elements of the array -->");
    for(i=0;i<n;i++)
    {
      System.out.print("a["+(i+1)+"] = ");
      a[i]=Integer.parseInt(br.readLine());
    }
    System.out.println("Original Array-->");
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
    System.out.println("\nSorted Array-->");
    ob.sort(a,0,n-1);
    for(i=0;i<n;i++)
      System.out.print(a[i]+"\t");
  }
}