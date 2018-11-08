package prac_exam;
import java.util.*;
class recur_func
{
    int n,t=1,f;
    recur_func(int s)
    {
        n=s;
    }
    void clac()
    {
        int i=0,k=1;
        int x;
        int y;
        int z;
        double sum;
        sum=0;
        for(i=1;i<n;i++)
        {
            x=pow(i);
            y=fact(i);
            z=x/y;
            System.out.print(z+" ");
            sum=sum+z;
        }
        System.out.println("Sum "+sum);
    }
    int pow(int s)
    {
        if(s==1)
        return t;
        else
        {
            t=t*s;
            return pow(--s);
        }
    }
    int fact(int r)
    {
        f=1;
        if(r==1)
        return f;
        else
        {
            f*=r;
            return fact(--r);
        }
    }
}