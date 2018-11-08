import java.util.*;
class ang1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of nubers to e entere");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=1;
		int count=0;
		int p=arr[0];
		for(int i=0;i<n;i++)
			if(p>arr[i])
			{
				p=arr[i];
			}
		int factors[]=new int[100];
		for(int i=2;i<=p;i++)
		{
			if(p%i==0)
			factors[count++]=i;
		}
		//todo:sort array factors
		for(int k=0;k<count;k++)
		{
			i=factors[k]
				boolean l=true;
				for(int j=0;j<n;j++)
				{
					if(arr[j]%i!=0)
						l=false;
				}
				if(l==true)
				{for(int q=0;q<n;q++)
					arr[q]=arr[q]/i;
					a=a*i;
				}
			}
		}
		for(int i=0;i<n;i++){
			a=a*arr[i];
			System.out.println(arr[i]+" ");}
		System.out.println(a);
	}
}
