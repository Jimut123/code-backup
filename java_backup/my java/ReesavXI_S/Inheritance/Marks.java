package Inheritance;
import java.util.*;
class Marks extends Student
{
    int m1,m2,m3;
    int tot=0;
    void insert()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter marks1 ");
        m1=sc.nextInt();
        System.out.print("Enter marks2 ");
        m2=sc.nextInt();
        System.out.print("Enter marks3 ");
        m3=sc.nextInt();
        tot=m1+m2+m3;
    }
}