package func_rec_;

import java.util.*;
class func_rec_num_rev
{
    int num,s;
    func_rec_num_rev(int n)
    {
        num=n;
        s=0;
    }
    void rev(int num)
    {
        int a=0;
        if(num!=0)
        {
            a=num%10;
            s=(s*10)+a;
            rev(num/10);
        }
        else
        {
            System.out.print(s);
            return;
        }
    }
}