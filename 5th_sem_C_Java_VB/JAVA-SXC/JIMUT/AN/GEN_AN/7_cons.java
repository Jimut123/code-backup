import java.io.*;
import java.lang.*;
class Sum
{
	int n;
	int arr[];// = new arr[100];
	Sum(int a[],int n1)
	{
		n=n1;
		arr=a;
	}
	int sumA()
	{
		int i,sum=0;
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	int large()
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
	Average(int a[],int n1)
	{
		super(a,n1);
		
		
	}
	float avgA()
	{
		float k = sumA();
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
				S_Dev ob = new S_Dev(arr,n);
				int sum=ob.sumA();
				float avg=ob.avgA();
				int large1=ob.large();
				float sd1=ob.sd();
				System.out.println("The sum of "+n+" numbers of the array : "+sum);
				System.out.println("The average of "+n+" numbers of the array : "+avg);
				System.out.println("The largest of "+n+" numbers of the array : "+large1);
				System.out.println("The sd of "+n+" numbers of the array : "+sd1);
		}
	S_Dev(int a[],int n1)
	{
		super(a,n1);
		
	}
	
	float sd()
	{
		float finala=0,su=0,av1 = avgA(),d,d2;
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