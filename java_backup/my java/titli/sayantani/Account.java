//base class for calculating simple interest and compound interest
import java.util.*;
class Account
{
  protected int an;
  protected double p;
  public void read()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the account no : ");
      an=sc.nextInt();
      System.out.println("Enter the principal amt : Rs.");
      p=sc.nextDouble();
    }
  public void display()
  {
      System.out.println("The account no is : "+an);
      System.out.println("The principal amount is : Rs."+p);
    }
}


//calculating simple interest

class Simple extends Account
{
   private int r;
   private int t;
   private double si;
   public void get()
   {
       super.read();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the rate(per annum) : ");
       r=sc.nextInt();
       System.out.println("Enter the time(years) : ");
       t=sc.nextInt();
       si=(p*r*t)/100;       
    }
    public void display()
    {
        System.out.println("Simple Interest : Rs.");
        super.display();
        System.out.println("The rate : "+r+" per annum");
        System.out.println("The time "+t+" years");
        System.out.println("The interest : Rs."+si);
    }
}

//calculating compound interest

class Compound extends Account
{
   private int r;
   private int t;
   private double ci;
   public void get()
   {
       super.read();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the rate(per annum) : ");
       r=sc.nextInt();
       System.out.println("Enter the time(years) : ");
       t=sc.nextInt();
       double g=Math.pow((1+(r/100.0)),t);
       ci=(p*g)-p;      
    }
    public void display()
    {
        System.out.println("Compound Interest : Rs.");
        super.display();
        System.out.println("The rate : "+r+" per annum");
        System.out.println("The time "+t+" years");
        System.out.println("The interest : Rs."+ci);
    }
}
