package func_rec_;

import java.util.*;
class func_rec_odd_num
{
    int a=1;
    void disp(int a)
    {
        if(a<30)
        {
            System.out.print(a);
            disp(a+2);
        }
        else
        return;
    }
}