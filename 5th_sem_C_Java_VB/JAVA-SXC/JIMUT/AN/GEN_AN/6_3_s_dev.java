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
	
class Average extends Sum
{
	float avgA(int arr[],int n)
	{
		Sum ob = new Sum();
		float k = ob.sumA(arr,n);
		return (float)(k/n);
	}
}

class S_Dev extends Average
{
	public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
				int i;
				System.out.println("Enter n :");
				int n = Integer.parseInt(cd.readLine());
				int arr[] = new int[20];
				for(i=0;i<n;i++)
				{
					System.out.println("arr["+i+"] : ");
					arr[i] = Integer.parseInt(cd.readLine());
				}
				S_Dev ob = new S_Dev();
				int sum=ob.sumA(arr,n);
				float avg=ob.avgA(arr,n);
				int large1=ob.large(arr,n);
				float sd1=ob.sd(arr,n);
				System.out.println("The sum of "+n+" numbers of the array : "+sum);
				System.out.println("The average of "+n+" numbers of the array : "+avg);
				System.out.println("The largest of "+n+" numbers of the array : "+large1);
				System.out.println("The sd of "+n+" numbers of the array : "+sd1);
		}
	
	float sd(int arr[],int n)
	{
		float finala=0,su=0,av1 = avgA(arr,n),d,d2;
		int i;
		for(i=0;i<n;i++)
		{
			d = java.lang.Math.abs(arr[i]-av1);
			d2 = (float)java.lang.Math.pow(d,2);
			su+=d2;
		}
		finala=(float)java.lang.Math.sqrt(su/n);
		return finala;
	}
}