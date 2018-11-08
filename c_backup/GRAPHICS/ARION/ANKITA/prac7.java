
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
	
	S_Dev obj=new S_Dev(a,n);

	System.out.print("\nSUM\n");
	System.out.print(obj.sum());
	System.out.print("\nAVG\n");
	System.out.print(obj.avg());
	System.out.print("\nLARGEST\n");
	System.out.print(obj.lar());
	System.out.print("\nStandard Dev\n");
	System.out.print(obj.STD());
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

	
	int sum()throws IOException
	{
	int i,sum=0;
	for(i=0;i<n;i++)
	sum=sum+a[i];
	return sum;
	}
	
	int lar()throws IOException
	{
	int large=a[0],i;
	for(i=1;i<n;i++)
	if(large<a[i])
	large=a[i];
	return large;
	}
}
class AVG extends SUM{

	AVG(int x[],int m){
		super(x,m);
	}

	float avg()throws IOException
	{
	float avg=sum()/n;
	return avg;
	}
}


class S_Dev extends AVG{
	
	S_Dev(int x[],int m){
		super(x,m);
	}

	double STD()throws IOException
	{
	int i;
	double std=1;
	for(i=0;i<n;i++)

	std+=(a[i]-avg())*(a[i]-avg());
	std/=n;
	std=Math.sqrt(std);
	return std;
	
	}
}