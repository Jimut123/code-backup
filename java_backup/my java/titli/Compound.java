//calculating compound interest
import java.util.*;
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
        System.out.println("Compound Interest");
        super.display();
        System.out.println("The rate : "+r+" per annum");
        System.out.println("The time "+t+" years");
        System.out.println("The interest : Rs."+ci);
    }
}
