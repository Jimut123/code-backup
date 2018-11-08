
public class sortno
{
	public static void main(int n)
	{
	int n1=n;
	int n2=n;
	int c=0;
	while(n1>0)
	{
	 
	 n1=n1/10;
	 c=c+1;
	 }
	 System.out.println(c);
	 int arr[]=new int [c];
	 int k=c;
	 while(n2>0)
	 {
	  arr[c-1]=n2%10;
	  n2=n2/10;
	  c=c-1;
	 }
	  for(int i=0;i<k;i++)
	 System.out.print(arr[i]);
	 System.out.println();
	 for(int i=0;i<k;i++)
	 { 
	  for(int j=0;j<k-i-1;j++)
	  {
	   if (arr[j]>arr[j+1])
	   { 
	     int temp=arr[j+1];
	     arr[j+1]=arr[j];
	     arr[j]=temp;
	     }
	     }
	     }
	     
	 for(int i=0;i<k;i++)
	 System.out.print(arr[i]);
	     
	     }
	     
	   
}
