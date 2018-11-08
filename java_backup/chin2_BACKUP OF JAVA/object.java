import java.io.*;
public class object
{
    int a,b;
    public int first(int a1)
    {
        a = a1+4;
        return a;
    }
    public int last(int b1)
    {
        b = b1+6;
        return b;
    }
    public static void main(String args[])
    {
        object ob1 = new object();
        object ob2 = new object();
        ob1.first(9);
        ob2.last(9);
        if(ob1.first(9)>ob2.last(9))
        {
            System.out.println(ob1.a);
        }
        else
        {
            System.out.println(ob2.b);
        }
    }
}
