import java.util.*;
class Emirp
{
    int n;int f;int rev;
    Emirp(int nm)
    {
        n=nm;
        rev=0;
        f=2;
    }
    int isprime(int x)
    {
        while(f<n)
        {    
           if(x%f==0||x==1)
            return 0;
           else
           {
              f++;
              return isprime(n);
            }
        }
        return 1;
    }
    void isEmirp()
    {
           int a=0;
           int x=0;
           x=isprime(n);
            while(n>0)
            {
            a=n%10;
            rev=rev+a;
            n=n/10;
           }
           int y;
           y=isprime(rev);
           if(x==1&&y==1)
           System.out.println("Emirp number ");
    }
}       