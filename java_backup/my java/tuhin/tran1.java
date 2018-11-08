
import java.io.*;
public class tran1
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
	  for(int j=n-1;j>=0;j--)
	  {
	  System.out.print(arr[j][i]);
	  }
	  System.out.println("");
	 }
	 
	 
	 
	 }
}
