public class amicable
{
    void main()
    {
        int a,b,c,d,e,sum1,sum2;
        for(a=100;a<=1000;a=a+1)
        {
            b=a;
            sum1=0;
            sum2=0;
            for(c=2;c<b;c=c+1)
            {
                if(b%c==0)
                {
                    sum1=sum1+c;
                }
            }
            for(c=a+1;c<=1000;c=c+1)
            {
                sum2=0;
                for(d=2;d<c;d=d+1)
                {
                    if(c%d==0)
                    {
                        sum2=sum2+d;
                    }
                }
                if(sum2==sum1)
                {
                    System.out.println(+a+","+c);
                    //break;
                }
            }
        }
    }
}

            
        
        
        
        