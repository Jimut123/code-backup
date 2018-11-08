class Maths
{
    public static void main(int i)
    {double t=0;
        if (i<=100000)
        t =0;
        
        if (i<=250000)
        t =(0.10*100000);
        
        if (i<=500000)
        t =(10000+0.15*2500000);
        
        if (i<=100000)
        t =(15000+0.20*500000);
        
        if (i>100000)
        t =(25000+0.25*1000000);
        System.out.println("tax" +t);
    }
}
