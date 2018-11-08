public class factorial extends power
{
    int a;
    void insert(int n)
    {
        a=n;
        super.insert(a);
        a=super.a/fact(a);
    }
    int fact(int b)
    {
        int s=1,m;
        for(m=1;m<=b;m++)
        {
            s=s*m;
        }
        return s;
    }
}
       