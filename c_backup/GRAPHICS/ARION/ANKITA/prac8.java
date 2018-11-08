
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
	
	BUB obj=new BUB(a,n);

	System.out.print("\nSorted\n");
	obj.bub();
	
	}

}

class BUB{

	int a[]=new int[20],n;

	BUB(int x[],int m){
		n=m;
		int i;
		for(i=0;i<n;i++)
			a[i]=x[i];
	}

	
	void bub()throws IOException
	{
	int i,j,sum=0,temp;
	

	for(i=0;i<n-1;i++){
		for(j=0;j<n-1-i;j++){
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}

	for(i=0;i<n;i++)
		System.out.print(a[i]+" ");
}
	
	
}
