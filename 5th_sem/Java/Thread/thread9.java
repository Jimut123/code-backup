import java.io.*;
class thread1 extends Thread
{
	//to calculate largest value from 3 elements
	public void run()
	{
		int a=10,b=30,c=5,big;
		big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println("\nOutput of thread1 : a ="+a+"b ="+b+"c ="+c+" big ="+big);
	
	}
}
class thread2 extends Thread
{
	//to calculate sum of 3 elements
	public void run()
	{
		int p=10,q=20,r=30,s;
		s=p+q+r;
		System.out.println("\n output of thread2  : p ="+p+"q="+q+"r="+r+"s ="+s);

	}
}
class thread9
{
 public static void main(String[] args) throws IOException
{
	thread1 A=new thread1();
	//A.setPriority(Thread.MAX_PRIORITY);
	thread2 B=new thread2();
	//B.setPriority(Thread.MIN_PRIORITY);
	A.start();
	B.start();
	System.out.println("\n Thread2 is now in suspend mode");
	B.suspend();
	System.out.println("\n Thread2 is now in resume mode");
	B.resume();
}
		
	
}