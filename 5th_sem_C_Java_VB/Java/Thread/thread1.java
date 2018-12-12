class Class_A extends Thread
{
  public void run()
  {
    int i,s=0,n=5;
    for(i=1;i<=n;i++)
    {
      s=s+i;
      System.out.println("Output of Thread Class_A : i = "+i+" s = "+s);
    }
    System.out.println("\nExit from thread Class_A");
  }
}
class Class_B extends Thread
{
  public void run()
  {
    int i,p=1,n=5;
    for(i=1;i<=n;i++)
    {
      p=p*i;
      System.out.println("Output of Thread Class_B : i = "+i+" p = "+p);
    }
    System.out.println("\nExit from thread Class_B");
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
class thread1
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