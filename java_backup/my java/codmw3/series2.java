import java.util.*;
public class series2
{
    void main()
    {
        int a,b,c,d,e,st1,st2;
        
        for(a=101;a<=999;a=a+1)
        {
            b=a;
            c=a%10; b=b/10;
            d=b%10; e=b/10;
            st1=Math.abs(d-c);
            st2=Math.abs(d-e);
            if(st1==st2)
            {
                System.out.println(+a);
            }
        }
    }
}