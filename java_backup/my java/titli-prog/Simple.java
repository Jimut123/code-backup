//calculating simple interest
import java.util.*;
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