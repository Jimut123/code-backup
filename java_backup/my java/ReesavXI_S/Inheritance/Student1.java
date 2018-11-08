package Inheritance;
import java.util.*;
class Student1
{
    String name="";
    int roll;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name ");
        name=sc.nextLine();
        System.out.print("Enter roll no ");
        roll=sc.nextInt();
    }
    void show()
    {
        System.out.println("Name :-"+name);
        System.out.println("Roll no :-"+roll);
    }
}