package func_rec_;
import java.io.*;
class happy_no_gen
{
    int sum;
    void gen()
    {
        int x=0;
        for(int i=0;i<1000;i++)
        {
            x=happy(i);
            if(x==1)
            System.out.println("Happy number "+i);
        }
    }
    int happy(int i)
    {
        if(i/10==0)
        return i;
        else
        {
            i=sum(i);
            sum=0;
            return happy(i);
        }
    }
    int sum(int i)
    {
        if(i==0)
        return sum;
        else
        {
            int a=i%10;
            sum=sum+(a*a);
            i=i/10;
            return sum(i);
        }
    }
}
        