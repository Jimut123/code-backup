//A+BC

import java.io.*;
public class truth_table
{
	public static int ar[]=new int[10];
	public static int bit[]=new int[10];
	public static int dc;//dig count
	
	truth_table()
	{
		dc=0;
	}
	public static void decToBin(int n)
	{
		int p=0,i,tmp=0,k,diff;
		dc=0;
		while(n!=0)
		{
			ar[dc++]=n%2;
			n/=2;
		}
		
		diff=3-dc;
		k=0;
		for(i=0;i<diff;i++)
			bit[k++]=0;
		
		for(i=dc-1;i>=0;i--)
			bit[k++]=ar[i];	
		
		
		
		
		
	}
	//===================================================
	
	public static int AND(int a,int b)
	{
		if(a==1 && b==1)
			return 1;
		else
			return 0;	
	}
	//===================================================
	
	public static int OR(int a,int b)
	{
		if(a==1 || b==1)
			return 1;
		else
			return 0;	
	}
	
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,bc=0,abc=0;
		System.out.print("\nA\tB\tC\tBC\t"+"A+BC");
		for(i=0;i<8;i++)
		{
			decToBin(i);
			bc=AND(bit[1],bit[2]);
			abc=OR(bit[0],bc);
			System.out.print("\n"+bit[0]+"\t"+bit[1]+"\t"+bit[2]+"\t"+bc+"\t"+abc);
			
		}
		
	}		
		
}