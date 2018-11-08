import java.util.*;
class dec_to_bin
{
    double num;
    dec_to_bin(double n)
    {
        num=n;
    }
    void calc()
    {
        int a=0,b=0,s=0,c=0,l=0;
        double a1;
        a=(int)num;
        a1=num-a;
        while(a!=0)
        {
            b=a%2;
            s=(s*10)+b;
            a=a/2;
        }
        while(s>0)
        {
            c=s%10;
            l=(l*10)+c;
            s=s/10;
        }
        System.out.print(l+".");
        for(a=0;a<6;a++)
        {
            a1=a1*2;
            b=(int)a1;
            System.out.print(b);
            a1=a1-b;
        }
        }
    }