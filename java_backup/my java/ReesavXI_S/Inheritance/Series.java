package Inheritance;
import java.util.*;
class Series extends Power
{
    int n;
    Series(int x)
    {
        n=x;
    }
    void Generate()
    {
        double sum=0;
        System.out.print("Sum = ");
        for(int i=0;i<n;i++)
        {
            double x=super.cal(i);
            System.out.print(x+" + ");
            sum=sum+x;
        }
        System.out.println();
        System.out.print("Total sum is "+sum);
    }
}