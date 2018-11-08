package Inheritance;
import java.util.*;
class AnnualYearly extends Product
{
    double sale=0.0d;
    double profit=0.0d;
    void getSale()
    {
        Scanner sc=new Scanner(System.in);
        super.readInfo();
        System.out.print("Enter sales marks ");
        sale=sc.nextDouble();
    }
    double getProfit()
    {
        profit=(40/100)*sale;
        return profit;
    }
    void display()
    {
        System.out.println("Porduct name "+prodname);
        System.out.println("Code "+code);
        System.out.println("Sale amount "+sale);
        System.out.println("Profit "+getProfit());
    }
}