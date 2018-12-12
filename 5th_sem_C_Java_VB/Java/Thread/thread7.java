////bubble sort and insertion sort using setPriotity() to set priority of threads in multithreaded programming 
import java.io.*;
class Bubble extends Thread
{
	public void run()
	{
	int a[]={50,40,30,20,10};
	int i,n,m,flag;
	flag=0;
	n=5;
	m=n;
	System.out.println("You're now in Thread bubble");
	System.out.println("Unsorted List(Thread Bubble)");
	System.out.println("Thread Bubble :");
	for(i=0;i<n;i++)
	System.out.print(a[i]+"\t");
	System.out.println();
	System.out.println("Thread Bubble goes to sleep mode...");
	System.out.println("Thread Bubble is out of sleep mode...");
	//bubble sort routine starts
	while(flag==0)
	{
	flag=1;
	m=m-1;
	for(i=0;i<m;i++)
	{
	if(a[i]>a[i+1])
	{
		int t=a[i];
		a[i]=a[i+1];
		a[i+1]=t;
		flag=0;
	}

	}

	}
	System.out.println("sorted list using bubble sort");
	System.out.println("Thread Bubble :");
	for(i=0;i<n;i++)
	System.out.print(a[i]+"\t");
	System.out.println();
	System.out.println("\nExit from Thread Bubble");
}
}

class Insertion extends Thread
{
	public void run()

	{
	int b[]={500,400,300,200,100};
	int i,n,j,t;
	n=5;
	System.out.println("You're now in Thread Insertion");
	System.out.println("Unsorted List(Thread Insertion)");
	System.out.println("Thread Insertion :");
	for(i=0;i<n;i++)
	System.out.print(b[i]+"\t");
	System.out.println();
	//insertion sort routine starts
	for(i=1;i<n;i++)
	{
	t=b[i];
	j=i-1;
	while(j>=0 && t<b[j])
	{
	b[j+1]=b[j];
	j=j-1;
	}
	b[j+1]=t;
	}
	System.out.println("sorted list using insertion sort");
	System.out.println("Thread Insertion :");
	for(i=0;i<n;i++)
	System.out.print(b[i]+"\t");
	System.out.println();
	System.out.println("\nExit from Thread Insertion");
	}
}
class thread7
{
	public static void main(String args[])
	{
	Bubble B=new Bubble();
	B.setPriority(Thread.MAX_PRIORITY);
	Insertion I=new Insertion();
	I.setPriority(Thread.MIN_PRIORITY);
	System.out.println("Entering in Thread Bubble ");
	
	B.start();
	System.out.println(" Entering in Thread Insertion");
	I.start();
	}
}