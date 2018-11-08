import java.io.*;
class triangle4
{
	public static void main(String args[])throws IOException
	{
	int a[]=new int[100];
	int m,j,n,p,i;
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter no.:");
	n=Integer.parseInt(input.readLine());
	m=0;
	j=n;
	while(j>0)
	{
	p=j%10;
	a[m]=p;
	m++;
	j=j/10;
	}
	int k=m;
	m=m-1;
	for(i=1;i<=k;i++)
	{
		for(j=1;j<=i;j++)
	{
	System.out.print(a[m]+"");
	m--;
	}
	m=k-1;
		System.out.println("");
	}	
	}
	}
