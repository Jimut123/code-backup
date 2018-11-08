package Inheritance;
import java.util.*;
class Interest extends Bank
{
    double Rate=0;
    int time;
    Interest(double n,int m)
    {
        super();
        Rate=n;
        time=m;
    }
    double calc()
    {
        double n=0;
        n=(Principle*Rate*time)/100;
        return n;
    }
    void display()
    {
        show();
        double x=0;
        x=calc();
        System.out.println("Simple interest is:-"+x);
    }
}
