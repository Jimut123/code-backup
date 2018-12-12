import java.io.*;
class Bubble extends Merge
{
	int arr[];
	Bubble(int[] arr1)
	{
		arr=arr1;
	}
	void bubbleSort() {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
	}

	
	void printArray()
	{
		int i;
		int n = arr.length;
		System.out.println("Sorted array : ");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	 public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
				System.out.println("n :");
				int n = Integer.parseInt(cd.readLine());
				System.out.println("Enter the elements of the array :");
				int a[] = new int[n],i;
				for(i=0;i<n;i++)
				{
					System.out.println("a["+i+"] : ");
					a[i]=Integer.parseInt(cd.readLine());
				}
				Bubble ob = new Bubble(a);
				System.out.println("\nEnter :\n [1] Bubble Sort \n [2] Merge Sort \n [3] Insertion Sort \n ");
				int ch;
				ch = Integer.parseInt(cd.readLine());
				switch(ch)
				{
					case 1:
						ob.bubbleSort();
						ob.printArray();
						break;
					case 2:
						ob.mergeSort(a,0,n-1);
						ob.printArray();
						break;
					case 3:
						ob.insertionSort(a,n);
						ob.printArray();
						break;
					default: System.out.println("Ops! out of choice!");
				}
	}
}

class Merge
{
	
	//mergeSort(arr, 0, arr_size - 1);
	

	void merge(int arr[], int l, int m, int r)
	{
	    int i, j, k;
	    int n1 = m - l + 1;
	    int n2 =  r - m;

	    /* create temp arrays */
	    //int L[n1], R[n2];
	    int L[] = new int[n1];
	    int R[] = new int[n2];

	    /* Copy data to temp arrays L[] and R[] */
	    for (i = 0; i < n1; i++)
		L[i] = arr[l + i];
	    for (j = 0; j < n2; j++)
		R[j] = arr[m + 1+ j];

	    /* Merge the temp arrays back into arr[l..r]*/
	    i = 0; // Initial index of first subarray
	    j = 0; // Initial index of second subarray
	    k = l; // Initial index of merged subarray
	    while (i < n1 && j < n2)
	    {
		if (L[i] <= R[j])
		{
		    arr[k] = L[i];
		    i++;
		}
		else
		{
		    arr[k] = R[j];
		    j++;
		}
		k++;
	    }

	    /* Copy the remaining elements of L[], if there
	       are any */
	    while (i < n1)
	    {
		arr[k] = L[i];
		i++;
		k++;
	    }

	    /* Copy the remaining elements of R[], if there
	       are any */
	    while (j < n2)
	    {
		arr[k] = R[j];
		j++;
		k++;
	    }
	}

	/* l is for left index and r is right index of the
	   sub-array of arr to be sorted */
	void mergeSort(int arr[], int l, int r)
	{
	    if (l < r)
	    {
		// Same as (l+r)/2, but avoids overflow for
		// large l and h
		int m = l+(r-l)/2;

		// Sort first and second halves
		mergeSort(arr, l, m);
		mergeSort(arr, m+1, r);

		merge(arr, l, m, r);
	    }
	}
	void insertionSort(int arr[], int n)
	{
	   int i, key, j;
	   for (i = 1; i < n; i++)
	   {
	       key = arr[i];
	       j = i-1;

	       /* Move elements of arr[0..i-1], that are
		  greater than key, to one position ahead
		  of their current position */
	       while (j >= 0 && arr[j] > key)
	       {
		   arr[j+1] = arr[j];
		   j = j-1;
	       }
	       arr[j+1] = key;
	   }
	}

}


