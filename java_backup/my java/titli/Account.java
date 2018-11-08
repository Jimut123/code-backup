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


        
 
        
        
   