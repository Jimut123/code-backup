package Inheritance;
import java.util.*;
class Result extends Marks1
{
    int OC1;
    int OC2;
    int total;
    int GT;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter other category marks ");
        OC1=sc.nextInt();
        System.out.print("Enter other category marks2 ");
        OC2=sc.nextInt();
        total=OC1+OC2;
        GT=super.total+total;
    }
    void show()
    {
        super.show();
        System.out.print("The grang total is "+GT);
    }
}
        