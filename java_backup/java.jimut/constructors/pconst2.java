import java.io.*;
class pconst2
{
    int a,b;
    pconst2(int x, int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("The values of a and b is::"+a+" "+b);
    }
}
class abc
{
    public static void main(String args[])
    {
    pconst2 ob = new pconst2(5,8);
    ob.display();
}
}
