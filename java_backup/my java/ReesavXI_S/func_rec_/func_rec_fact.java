package func_rec_;

import java.io.*;
class func_rec_fact
{
    int num,f;
    func_rec_fact(int n)
    {
        num=n;
        f=1;
    }
    void fact(int num)
    {
        if(num!=1)
        {
            f=f*num;
            fact((num-1));
        }
        else
        {
            System.out.println(f);
            return;
        }
    }
}