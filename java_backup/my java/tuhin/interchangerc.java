import java.io.*;
public class interchangerc
{
	public static void main(int n)throws IOException
	{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int arr[][]=new int[n][n];
	 for(int i=0;i<n;i++)
	 {
	  for(int j=0;j<n;j++)
	  {
	   System.out.print("enter a number ");
	   arr[i][j]=Integer.parseInt(br.readLine());
	   }
	 }
	 for(int i=0;i<n;i++)
	 {
	  for(int j=0;j<n;j++)
	  {
	  int temp=arr[i][j];
	  arr[i][j]=arr[n-i-1][j];
	  arr[n-i-1][j]=temp;
	  }
	 }
	 for(int i=0;i<n;i++)
	 {
	  for(int j=0;j<n;j++)
	  {
	   System.out.print(arr[i][j]);
	  }
	  System.out.println();
	   }
	 
	 
	 }
}
