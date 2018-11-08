
import java.io.*;
class thread1 extends Thread
{
	int i;
	public void run()
	{
	for(i=1;i<=5;i++)
	 System.out.println(i);
	System.out.println("thread1");
	}
}

