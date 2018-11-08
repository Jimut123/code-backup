import java.util.*;
class square_root
{
    int num;
    square_root(int n)
    {
        num=n;
    }
    void cal()
    {
        double i;
        double a;
        a=1;
        for(i=0.01;i<num;i=i+.01)
        {
            a=i*i;
            if((num-a)==0)
            {
            System.out.println(i);
            break;
        }
        else if((num-a)<.1)
        {
            System.out.print(i);
            break;
        }
        }
    }
    }