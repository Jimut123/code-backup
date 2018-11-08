import java.util.*;
class num_new
{
    int n;
    num_new(int s)
    {
        n=s;
    }
    void clac()
    {
        int r,a,s=0,cr=0;
        r=n;
        System.out.println(n);
        while(r>0)
        {
            a=r%10;
            s=(s*10)+a;
            r=r/10;
            cr++;
        }
        while(s>0)
        {
            a=s%10;
            if(prime(a))
            {
                for(cr=a;;cr++)
                {
                    if(prime(cr))
                    continue;
                    else
                    {
                        System.out.print(cr);
                        break;
                    }
                }
            }
            else
            System.out.print(cr);
            s=s/10;
        }
    }
    boolean prime(int i)
    {
        int k=0,c=0;
        for(k=2;k<i;k++)
        {
            if(i%k==0)
            c=c+1;
        }
        if(c==0)
        return true;
        else
        return false;
    }
}

                        