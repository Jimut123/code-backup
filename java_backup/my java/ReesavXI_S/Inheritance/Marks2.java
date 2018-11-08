package Inheritance;
import java.util.*;
class Marks2 extends Student2 implements Extra
{
    int m1;
    int m2;
    int m3;
     int EC1;
    int EC2;
    int total;
    public void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks in EC1 ");
        EC1=sc.nextInt();
        System.out.print("Enter marks in EC2 ");
        EC2=sc.nextInt();
    }
    void enter()
    {
        Scanner sc=new Scanner(System.in);
        input();
        System.out.print("Enter marks1 ");
        m1=sc.nextInt();
        System.out.print("Enter marks2 ");
        m2=sc.nextInt();
        System.out.print("Enter marks3 ");
        m3=sc.nextInt();
        total=m1+m2+m3+EC1+EC2;
    }
    void display()
    {
        show();
        System.out.println("Your marks are :- "+m1+" "+m2+" "+m3);
        System.out.println("The grand total is :- "+total);
    }
    void main()
    {
        enter();
        insert();
        display();
    }
}