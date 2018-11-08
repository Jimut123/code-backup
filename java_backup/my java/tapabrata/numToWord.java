

import java.io.*;

class numToWord
{
	public static String ar1[]={"Zero ","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ","Eleven ","Tweleve ","Thirteen ","Forteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
	public static String ar2[]={"Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
	
	public static void zeroTo19(int n)
	{
		System.out.print(ar1[n]);
	}
	//--------------------------------
	public static void divisibleBy10(int n)
	{
		System.out.print(ar2[n/10-2]);
	}
	//---------------------------------
	public static void zeroTo100(int n)
	{
		int r=0,q=0;
		if(n>=0 && n<20)
		{
			zeroTo19(n);
		}
		else
		if(n>=20 && n<100 && n%10==0)	
		{
			divisibleBy10(n);
		}
		else
		if(n>=20 && n<100 && n%10!=0)		
		{
		 	r=n%10;
		 	q=n-r;
		 	divisibleBy10(q);
		 	zeroTo19(r);
		}
		else
		if(n==100)	
		{
			System.out.print("\nOne Hundred");
		}
	}
	
	//--------------------------------------------
	
	public static void zeroTo1000(int n)
	{
		int r=0,q=0;
		if(n>=0 && n<=100)
		{
			zeroTo100(n);
		}
		else
		if(n>100 && n<1000 && n%100==0)	
		{
			zeroTo19(n/100);
			System.out.print("Hundred");
		}
		else
		if(n>100 && n<1000 && n%100!=0)		
		{
		 	r=n%100;
		 	q=n-r;		 	
		 	zeroTo19(q/100);
		 	System.out.print("Hundred And ");
		 	zeroTo100(r);
		}
		else
		if(n==1000)	
		{
			System.out.print("\nOne Thousand");
		}
		else
		{
			System.out.print("\nout of 0 -1000");
		}
	}
	
	//--------------------------------------------
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num;
		System.out.println("Enter a number [0-1000]:");
		num=Integer.parseInt(br.readLine());
		zeroTo1000(num);
	} 
		
		
}