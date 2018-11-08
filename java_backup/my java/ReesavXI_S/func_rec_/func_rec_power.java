package func_rec_;
import java.util.*;
class func_rec_power
{
    int a,p;
    func_rec_power(int n,int m)
    {
        a=n;
        p=m;
    }
    void power(int a,int b,int s)
    {
        if(b==p)
        {
            System.out.print(s*a);
            return;
        }
        else
        {
            s=a*b;
            power(a,(b+1),s);
        }
    }
}