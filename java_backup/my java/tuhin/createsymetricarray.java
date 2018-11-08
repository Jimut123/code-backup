

public class createsymetricarray
{
	public static void create(int n)
	{
	 int arr[][]=new int [n][n];
	 for(int i=0;i<n;i++)
	 {
	  for(int j=0;j<n;j++)
	  {
	   arr[i][j]=0;
	   }
	   }
	   int c=1;
	   for(int i=0;i<n;i++)
	   for(int j=0;j<n;j++)
	    {
	    if(arr[i][j]==0)
	    {
	     arr[i][j]=c;
	     arr[j][i]=c;
	     c++;
	     }
	     }
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<n;j++)
	      {System.out.print(arr[i][j]+"  ");
	       }
	     System.out.println();
	     }
	     }
	     }
	     