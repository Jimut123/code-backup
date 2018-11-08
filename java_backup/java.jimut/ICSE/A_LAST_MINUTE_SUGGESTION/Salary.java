package A_LAST_MINUTE_SUGGESTION;
import java.io.*;
class Salary
{
    InputStreamReader ab = new InputStreamReader(System.in);
    BufferedReader cd = new BufferedReader(ab);
    String Name,Address;
    int Rate, Wage;
    double  WeeklyWage;
    void input()throws IOException
    {
        System.out.println("Enter your name,address,rate and wage:");
        Name=cd.readLine();
        Address=cd.readLine();
        Rate=Integer.parseInt(cd.readLine());
        Wage=Integer.parseInt(cd.readLine());
    }
    void show()
    {
        System.out.println(" Your name : "+Name);
        System.out.println(" Your address : "+Address);
        System.out.println(" Your rate : "+Rate);
    }
    void calWage(int hours)
    {
        WeeklyWage = (double)Rate*Wage*hours*7.0;
        System.out.println("WeeklyWage = "+WeeklyWage);
    }
    public static void main(String args[])throws IOException
    {
         InputStreamReader ab = new InputStreamReader(System.in);
         BufferedReader cd = new BufferedReader(ab);
         Salary ob = new Salary();
         System.out.println("Enter the annual taking hours:");
         int h1 = Integer.parseInt(cd.readLine());
         ob.input();
         ob.show();
         ob.calWage(h1);
       
        }
    }
        