import java.util.*;
class pattern
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number n");
	int n=sc.nextInt();
	System.out.println("Enter the values in the matrix");
	int arr[][]=new int [n][n];
	for(int i=0;i<n;i++)
		for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
	int a=0;
	int b=1;
	for(int i=0;i<n;i++)
	{ a=i+1; 
	  b=0;
	for(int j=0;j<n;j++)
	{
		if(i<j)
		{
			int temp=arr[i][j];
			arr[i][j]=arr[a][b];
			arr[a][b]=temp;
			a=a+1;
			b=b+1;
		}
	}}
	for(int i=0;i<n;i++)
	{
		System.out.println();
		for(int j=0;j<n;j++)
			System.out.print(arr[i][j]+" ");
	}
}
}


