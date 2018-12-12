
import java.io.*;

import java.util.*;

class Ex_1
{

	public static void main(String args[])throws IOException
	{
	int a[]=new int[20],n,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter n=");
	n=Integer.parseInt(br.readLine());
	for(i=0;i<n;i++){
	System.out.print("\nEnter a["+i+"]=");
	a[i]=Integer.parseInt(br.readLine());
	}
	Ex_2 obj=new Ex_2();
	System.out.print("\nSUM\n");
	System.out.print(obj.SUM(a,n));
	System.out.print("\nAVG\n");
	System.out.print(obj.AVG(a,n));
	System.out.print("\nLARGEST\n");
	System.out.print(obj.LAR(a,n));
	System.out.print("\nStandard Dev\n");
	System.out.print(obj.STD(a,n));
	}

}

class Ex_2{

	
	public static int SUM(int a[],int n)throws IOException
	{
	int i,sum=0;
	for(i=0;i<n;i++)
	sum=sum+a[i];
	return sum;
	}

	public static float AVG(int a[],int n)throws IOException
	{
	float avg=SUM(a,n)/n;
	return avg;
	}
	
	public static int LAR(int a[],int n)throws IOException
	{
	int large=a[0],i;
	for(i=1;i<n;i++)
	if(large<a[i])
	large=a[i];
	return large;
	}

	public static double STD(int a[],int n)throws IOException
	{
	int i;
	double std=1;
	for(i=0;i<n;i++)
	std+=(a[i]-AVG(a,n))*(a[i]-AVG(a,n));
	std/=n;
	std=Math.sqrt(std);
	return std;
	
	}

}
