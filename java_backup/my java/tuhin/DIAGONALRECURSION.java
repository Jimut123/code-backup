import java.io.*;
public class DIAGONALRECURSION
{
    static int m,i,j;
    static int t;
    
	public static void main (int l,int b)throws IOException
	{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int arr[][]=new int [l][b];
	m=l;
	t=b;
	System.out.println("Numbers:");
	System.out.println("Give Numbers:"+l+","+b);
	for(int i=0;i<l;i++)
	{ 
	 for(int j=0;j<b;j++)
	 {
	 System.out.println("Give Numbers:");
	  arr[i][j]=Integer.parseInt(br.readLine());
	  }
	  
	  }
	  int a=0;
	  System.out.println("Left Diagonal Numbers:");
	  leftdiagonal(a ,arr);
	  }
	  public static void leftdiagonal(int a ,int arr[][])
	  {
	  //System.out.println(m);
	  //System.out.println(a);
	  if(a>=m)
	  return;
	  else
	  {
	  System.out.println(arr[a][a]);
	  a=a+1;
	  leftdiagonal(a ,arr);
	  }
	  
	  }
	  }
	  
	  
	  
	  
	  
	 
	 
	   
	
