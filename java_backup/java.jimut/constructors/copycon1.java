class copycon1
{
    int a,b;
    copycon1(int x, int y)
    {
        a=x;
        b=y;
    }
    copycon1(copycon1 p)
    {
        a = p.a;
        b = p.b;
    }
}
class abcd
{
    public static void main(String args[])
    {
        copycon1 ob = new copycon1(5,8);
        copycon1 ob1 = new copycon1(ob);
    }
}