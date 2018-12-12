import java.io.*;
import java.lang.*;
class Binary_Search
{
	int a[],index[];
	int n;
	public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
               
                Binary_Search ob = new Binary_Search();
        }
	Binary_Search()throws IOException
	{
		int i;
		InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
		 		System.out.println("\nEnter the size of the array : ");
        		n=Integer.parseInt(cd.readLine());
        		index = new int[n];
        		a = new int[n];
                for(i=0;i<n;i++)
                {
                	System.out.println("\nEnter the index :");
                	index[i]=Integer.parseInt(cd.readLine());
                	System.out.println("\nEnter the value of a["+i+"] : ");
                	a[i]=Integer.parseInt(cd.readLine());
                }
                printArray();
                bubbleSort();
                printArray();
                System.out.println("\nEnter the no. to be searched :");
                int num = Integer.parseInt(cd.readLine());
                int k=BinarySearch(0,n,a,num);
                if(k==0)
                {
                	System.out.println("Number is not present!");
                }
	}
	void printArray()throws IOException
	{
		int i;
		System.out.println("\n");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" index = "+index[i]+"\n");
		}
	}
	void bubbleSort()throws IOException
	 {  
        int n = a.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                                 temp=index[j-1];
                                 index[j-1]=index[j];
                                 index[j]=temp;
                         }  
                          
                 }  
         }  
	}
	int BinarySearch(int l,int u, int a[],int num)		// 0,n,array,no. to be searched
	{

		int mid = (l+u)/2;
		if(mid>u||mid<l)
		{
			return 0;
		}
		if(num>a[mid])
		{
			BinarySearch(mid+1,u,a,num);
		}
		if(num<a[mid])
		{
			BinarySearch(l,mid-1,a,num);
		}
		if(num==a[mid])
		{
			System.out.println("No. found! at index = "+index[mid]);
		}
		return 1;
	}
	
}