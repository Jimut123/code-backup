
import java.io.*;
class thread2 extends Thread
{
	int i;
	public void run()
	{
	for(i=1;i<=5;i++)
	 System.out.println(i);
	System.out.println("thread2");
	}
}

