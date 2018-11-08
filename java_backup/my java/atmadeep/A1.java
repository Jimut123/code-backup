import java.io.*;
class a1 extends Thread
{
int i;
public void run()
{
for(i=0;i<=5;i++)
System.out.print(i);
System.out.print("a1");
}
}
