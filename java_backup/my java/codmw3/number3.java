import java.util.*;
public class number3
{
    Scanner sc=new Scanner(System.in);
    class even
    {
        int m;
        even a1;
    }
    class odd
    {
        int n;
        odd d1;
    }
    even a2=new even();
    even a3=a2;
    odd d2=new odd();
    odd d3=d2;
    void input()
    {
        String a;
        int b;
        System.out.println("Enter number");
        a=sc.nextLine();
        for(b=0;b<a.length();b++)
        {
            if((b+1)%2==0)
            {
                a2.m=Integer.parseInt(""+a.charAt(b));
                a2.a1=new even();
                a2=a2.a1;
            }
            else
            {
                d2.n=Integer.parseInt(""+a.charAt(b));
                d2.d1=new odd();
                d2=d2.d1;
            }
        }
    }
}