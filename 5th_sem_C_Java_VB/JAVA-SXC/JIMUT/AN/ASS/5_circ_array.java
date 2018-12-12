import java.io.*;
import java.util.Random;
class CircArray
{
	int n,arr[],n1;
	public static void main(String args[])throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(ab);
		CircArray ob = new CircArray();
	}
	CircArray()throws IOException
	{
		InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
		System.out.println("\nEnter the array size :");
		n = Integer.parseInt(cd.readLine());
		Random rand = new Random();
		System.out.println("\nThe elements :");
		int i;
		arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=rand.nextInt(n) + 1;
		}
		System.out.println("Enter the no. of shift : ");
		n1 = Integer.parseInt(cd.readLine());
		printArray();
		swpt();
		System.out.println("\nThe shift without any 3rd var : ");
		printArray();
	}
	void printArray()
	{
		int i;
		for(i=0;i<n;i++)
                {
                        System.out.print(arr[i]+" ");
                }
		System.out.println("");

	}
	void swpt()throws IOException
	{
		int i,t,j;
		for(j=1;j<=n1;j++)		
		{
			for(i=0;i<n-1;i++)
			{
				arr[i]=arr[i]+arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
		}
	}
}
