//multi level Inheritance
import java.io.*;
class AB
{
  protected int A;
  AB()
  {
      AB=0;
    }
    AB(int a)
    {
        A=a;
    }
    public void show()
    {
        System.out.println("A ="+A);
    }
}
class AB1 extends AB
{
  protected int B;
  AB1()
  {
      B=0;
    }
    AB1(int b,int a)
    {
        B=b;
        super(a);
    }
    public void show()
    {
        super.show();
        System.out.println("B ="+B);
    }
}
class AB2 extends AB1
{
  int C;
  AB2()
  {
      C=0;
    }
    AB2(int a,int b,int c)
    {
        super(a,b);
        C=c;
    }
    public void show()
    {
        super.show();
        System.out.println("C ="+C);
    }
}
public class AB2main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter value of A");
       int n1=sc.nextInt;
      System.out.println("enter value of B");
       int n2=sc.nextInt();
      System.out.println("enter value of C");
       int n3=sc.nextInt();
      AB2 obj=new AB2(n1,n2,n3);
      obj.show();
    }
}
  
        
    