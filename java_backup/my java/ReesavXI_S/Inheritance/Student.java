package Inheritance;
import java.util.*;
class Student
{
    String name="";
    int roll;
    String sec="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name ");
        name=sc.nextLine();
        System.out.print("Enter roll ");
        roll=sc.nextInt();
        System.out.print("Enter sec ");
        sec=sc.nextLine();
    }
}       