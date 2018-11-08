class pct
{
    int a,b;
    pct(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("the value of a is: "+ a +" the value of b is: "+b);
    }
}
class ckl
{
    public static void main(String args[])
    {
        pct ob = new pct(990,90);
        ob.display();
    }
}
