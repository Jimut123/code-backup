package Inheritance;
import java.util.*;
class Employee
{
    String name="";
    int code;
    int basic;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name ");
        name=sc.nextLine();
        System.out.print("Enter code ");
        code=sc.nextInt();
        System.out.print("Enter basic pay ");
        basic=sc.nextInt();
    }
    void display()
    {
        System.out.println("Employee details ");
        System.out.println("Name :- "+name);
        System.out.println("Code :- "+code);
        System.out.println("Basic pay :-"+basic);
    }
}