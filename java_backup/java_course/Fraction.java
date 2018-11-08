public class Fraction
{
    private int num,den;
    Fraction(int n,int d)
    {
        num = n;
        den = d;
    }
    public Fraction add(Fraction b)
    {
        Fraction r = new Fraction(0,1);
        r.den=den*b.den;
        r.num=num*b.den+den*b.num;
        return r;
    }
    public String display()
    {
        String x="";
        x+=num+"/";
        x+=den;
        return x;
    }
}