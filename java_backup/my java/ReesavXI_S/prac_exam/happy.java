package prac_exam;
import java.util.*;
class happy
{
    int n;
    happy(int s)
    {
        n=s;
    }
    void clac()
    {
        int x=1;int y=11;
        x=square_sum(n);
        while(y>10)
        {
            y=square_sum(x);
        }
        if(y==1)
         System.out.print("Happy number "+n);
        else
         System.out.print("Unhappy number "+n);
        }
    int square_sum(int r)
    {
        int a=0;
        int sum=0;
        while(r>0)
        {
            a=r%10;
            System.out.print("+"+a+"*"+a);
            sum=sum+(int)Math.pow(a,2);
            r=r/10;
        }
        System.out.println("="+sum);
        return sum;
    }
}
            