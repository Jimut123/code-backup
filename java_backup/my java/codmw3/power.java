public class power
{
    int a;
    void insert(int n)
    {
        a=n;
        a=pow(a);
    }
    int pow(int c)
    {
        return (int)Math.pow(c,c);
    }
}