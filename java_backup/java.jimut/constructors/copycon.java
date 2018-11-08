class copycon
{
    int a,b;
    copycon(int x,int y)
    {
        a=x;
        b=y;
    }
}
class abc
{
    public static void main(String args[])
    {
        copycon ob = new copycon(5,8);
        copycon ob1=ob;
    }
}
