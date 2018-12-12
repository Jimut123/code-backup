import java.io.*;
class Class_A extends Thread
{
  public void run()
  {
    try{
    int a,b,s,avg;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("\nEnter a = ");
    a=Integer.parseInt(br.readLine());
    System.out.print("\nEnter b = ");
    b=Integer.parseInt(br.readLine());
    s=a+b;
    avg=s/2;
    System.out.println("Output of Thread Class_A : sum = "+s+" avg = "+avg);
    System.out.println("\nExit from thread Class_A");
    }
    catch(Exception e){}
  }
}
class Class_B extends Thread
{
  public void run()
  {
    try{
    int i,p=1,n=5;
    for(i=1;i<=n;i++)
    {
      p=p*i;
      System.out.println("Output of Thread Class_B : i = "+i+" p = "+p);
      if(i == 3)
      {
        System.out.println("Thread Class_B goes to sleep mode");
        sleep(10000);
        System.out.println("Thread Class_B is out of sleep mode");
      }
    }
    System.out.println("\nExit from thread Class_B");
    }
    catch(Exception e){}
  }
}
class Class_C extends Thread
{
  public void run()
  {
    int i,s1=0,n=12345,d;
    while(n!=0)
    {
      d=n%10;
      s1=s1+d;
      n=n/10;
      System.out.println("Output of Thread Class_C : d = "+d+" s1 = "+s1);
    }
    System.out.println("\nExit from thread Class_C");
  }
}
class thread2
{
  public static void main(String args[])
  {
    Class_A A = new Class_A();
    Class_B B = new Class_B();
    Class_C C = new Class_C();
    A.start();
    B.start();
    C.start();
  }
}