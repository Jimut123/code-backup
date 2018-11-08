class  hcflcm
{
    int a,b;
    hcflcm(int x, int y)
    {
        a=x;
        b=y;
    }
    void calculate()
    {
        int dd,div,rem=1,l,h=0;
        if(a>b)
        {
            div=b;
            dd=a;
        }
        else 
        {
            div=a;
            dd=b;
        }
        while(rem!=0)
        {
            rem=dd%div;
            if(rem==0)
            {
                h=div;
            }
            else
            {
                dd=div;
                div=rem;
            }
        }
        
     l=(a*b)/h;
     System.out.println(" H.C.F. is=="+h);
     System.out.println("The L.C.M. is="+l);
    }
}
public class abc
{
    public static void main(String args[])
    {
        hcflcm ob = new hcflcm(14,12);
        ob.calculate();
    }
}
        
        
        
        
        
        
