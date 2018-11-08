package package_sorting;
import java.io.*;
public class sorting_class
{
	public void bubbleSort(int a[], int n)
	{
		int t=0, j=0;
		for(int i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
	}
	public void insertionSort(int a[], int n)
	{
		int t=0, j=0;
		for(int i=1;i<n;i++)
		{
			t=a[i];
			for(j=i-1;j>=0&&t<a[j];j--)
				a[j+1]=a[j];
			a[j+1]=t;
		}

	}
}