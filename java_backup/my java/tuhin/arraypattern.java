
import java.io.*;
public class arraypattern
{
	
	public static void create(int l)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int arr[][]=new int [l][l];
	 for(int i=0;i<l;i++)
	 {
	  for(int j=0;j<l;j++)
	  {
	  System.out.println("Give string:");
	   arr[i][j]=Integer.parseInt(br.readLine());
	   }
	   }
	   for(int i=0;i<l;i++)
	 {
	  for(int j=0;j<l;j++)
	  {
	  if(i==0 )
	  System.out.print("  "+arr[i][j]+"  ");
	   else if(i==(l-1))
	  System.out.print("  "+arr[i][j]+"  ");
	  else if(i==j)
	  System.out.print("  "+arr[i][j]+"  ");
	  else if(i==(l-j-1))
	  System.out.print("  "+arr[i][j]+"  ");
	   else
	   System.out.print("  "+"  ");
	   }
	   System.out.println();
	   }
	   
}
}
