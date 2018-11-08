import java.io.*;
class dconst1
{
    int a,b;
    dconst1()
    {
        a=0;
        b=0;
    }
    void display()
    {
        System.out.println("values of a and b::"+a+' ' +b);
    }
}
class abc
{
    public static void main(String args[])
    {
        dconst1 ob = new dconst1();
        ob.display();
    }
}
        