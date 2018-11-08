import java.io.*;
class Sum
{
	int sumA(int arr[],int n)
	{
		int i,sum=0;
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	int large(int arr[],int n)
	{
		int i,la=arr[0];
		
		for(i=0;i<n;i++)
		{
			if(arr[i]>la)
				la = arr[i];
		}
		return la;
	}
	
}
	
  