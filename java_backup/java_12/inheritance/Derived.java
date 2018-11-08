class Derived extends Base
{
    int y;
    Derived(int a, int b)
    {
        super(a);
        y=b;
    }
    void display()
    {
        System.out.println("p = "+p+" , y = "+y);
    }
}