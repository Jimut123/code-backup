package Inheritance;
import java.util.*;
class Bank
{
    int ACNO;
    String name="";
    int Principle;
    Bank()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Acc No ");
        ACNO=sc.nextInt();
        System.out.print("Enter name ");
        name=sc.nextLine();
        System.out.print("Enter Principle ");
        Principle=sc.nextInt();
    }
    void show()
    {
        System.out.println("Account number is:-"+ACNO);
        System.out.println("Name :-"+name);
        System.out.println("Principle "+Principle);
    }
}
