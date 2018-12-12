import package_sorting.*;
import java.io.*;
import java.util.*;
public class My_Main2
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int a[]=new int[n], i=0;
		for(i=0;i<n;i++)
		{
			System.out.print("Enter values: ");
			a[i]=sc.nextInt();
		}	
		sorting_class obj=new sorting_class();
		obj.insertionSort(a,n);
		System.out.print("\nOUTPUT\n");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}