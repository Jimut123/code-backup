import java.io.*;
class prime
{
    public static void main(int n)
    {
        int m=n;
        int f=0;
        for(int i=2;i<n;i++)
        if(n%i==0)
        {
            f=1;
            break;
        }
        if(f>0)
        System.out.println("no is not prime");
        else
        {
            
            while(m>=n)
            {
                m++;
                int f1=0;
                for(int i=2;i<m;i++)
                if(m%i==0)
                {
                f1=1;
                break;
            }
            if(f1==0)
             {           
            System.out.println("aftrprime="+m);
            break;
        }
        }
        
        while(n>0)
        {
            n--;
            int f2=0;
            for(int i=2;i<n;i++)
            if(n%i==0)
            {
                f2=1;
                break;
            }
            if(f2==0)
            {
            System.out.println("bfr prime="+n);
            break;
        }
            
        
        }
    }
}
}
            
            