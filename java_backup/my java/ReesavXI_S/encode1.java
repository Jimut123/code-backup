import java.util.*;
class encode1
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter code ");
        n=sc.nextInt();
    }
    void clac()
    {
        int m=0;
        while(n>0)
        {
            m=crack();
            System.out.print((char)m+" ");
        }
    }
    int crack()
    {
        int a=n%100;
        a=rev(a);
        if((a>64&&a<91)||(a>96&&a<100)||(a==32))
        {
            n=n/100;
            return a;
        }
        n=n/1000;
        return rev(n%1000);
    }
    int rev(int m)
    {
        int a,rev=0;
        while(m>0)
        {
            a=m%10;
            rev=(rev*10)+a;
            m=m/10;
        }
        return rev;
    }
}