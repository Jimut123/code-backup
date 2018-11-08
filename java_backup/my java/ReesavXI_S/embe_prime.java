import java.util.*;
class embe_prime
{
    int n;
    embe_prime(int s)
    {
        n=s;
    }
    void clac()
    {
        int i=2,j=0,k=0,b=0,a=0,f=0,k45=0;
        boolean r;
        for(i=2;i<n;i++)
        {
            r=prime(i);
            j=n;
            k=i;
            if(r)
            {
                f=0;k45=0;
                while(k>0)
                {
                    a=k%10;
                    while(j>0)
                    {
                        b=j%10;
                        if(b==a)
                        {
                            f=1;
                            break;
                        }
                        j=j/10;
                    }
                    if(f==0)
                    {
                        k45=1;
                        break;
                    }
                    else
                    f=0;
                    k=k/10;
                }
                if(k45!=1)
                System.out.println(i);
            }
        }
    }
    boolean prime(int s)
    {
        int j=2,cr=0;
        for(j=2;j<s;j++)
        {
            if(s%j==0)
            cr++;
        }
        if(cr==0)
        return true;
        else
        return false;
    }
}