
import java.io.*;

//import java.util.*;

class Calc
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
	SUM obj1=new SUM(a,n);
	AVG obj2=new AVG();
	S_Dev obj3=new S_Dev();

	System.out.print("\nSUM\n");
	System.out.print(obj1.sum(a,n));
	System.out.print("\nAVG\n");
	System.out.print(obj2.avg(a,n));
	System.out.print("\nLARGEST\n");
	System.out.print(obj1.lar(a,n));
	System.out.print("\nStandard Dev\n");
	System.out.print(obj3.STD(a,n));
	}

}

class SUM{

	int a[]=new int[20],n;

	SUM(int x[],int m){
		n=m;
		int i;
		for(i=0;i<n;i++)
			a[i]=x[i];
	}

	
	public static int sum(int a[],int n)throws IOException
	{
	int i,sum=0;
	for(i=0;i<n;i++)
	sum=sum+a[i];
	return sum;
	}
	
	public static int lar(int a[],int n)throws IOException
	{
	int large=a[0],i;
	for(i=1;i<n;i++)
	if(large<a[i])
	large=a[i];
	return large;
	}
}
class AVG extends SUM{
	public static float avg(int a[],int n)throws IOException
	{
	float avg=sum(a,n)/n;
	return avg;
	}
}


class S_Dev extends AVG{
	public static double STD(int a[],int n)throws IOException
	{
	int i;
	double std=1;
	for(i=0;i<n;i++)

	std+=(a[i]-avg(a,n))*(a[i]-avg(a,n));
	std/=n;
	std=Math.sqrt(std);
	return std;
	
	}
}

