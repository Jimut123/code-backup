class HCF
{
    int HCF(int a,int b)
    {
        if(b==0)
        return a;
        else
        return HCF(b,a%b);
    }
}