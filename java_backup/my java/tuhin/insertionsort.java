
public class insertionsort
{
    public static void main(String args[])
    {
        int arr[]={4,8,3,78,95,45,2};
        int n=7;
        for(int i=1;i<n;i++)
        {
            int temp=arr[i];
            int ptr=i-1;
            while(temp<arr[ptr] && ptr>=1)
            {
                arr[ptr+1]=arr[ptr];
                ptr=ptr-1;
                arr[ptr+1]=temp;
            }
        }
        for(int i=0;i<n;i++)
	 {
	     System.out.print(arr[i]+" ");
	   }
}
}