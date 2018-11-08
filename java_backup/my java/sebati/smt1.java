import java.util.*;
class smt1
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        n=sc.nextInt();
    }
    void check()
    {
        int f,i,sumf=0,df,sf=0,j,dig,sum=0,n1;
        n1=n;
        while(n>=1)
       {        
       //System.out.println(n);
           for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                f=i;
                sf=0;
                if(f>9)
                {
                    while(f>0)
                    {
                        df=f%10;
                        sf=sf+df;
                        f=f/10;
                    }
                }
                else
                {
                    sf=f;
                }
                sumf=sumf+sf;
                 break;
            }
           
        }
        n=n/i;
    }
        while(n1>0)
        {
            dig=n1%10;
            sum=sum+dig;
            n1=n1/10;
        }
        //System.out.println(sum);
        //System.out.println(sumf);
        if(sum==sumf)
        System.out.println("Smith no......");
        else
        System.out.println("non smith no........");
    }

public static void main(String args[])
{
 smt1 am=new smt1();
 am.input();
 am.check();
 }
}