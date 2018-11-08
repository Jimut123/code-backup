import java.io.*;
class inher1
{
    int x;
    inher1(int y)
    {
        x=y;
    }
    void disp()
    {
        System.out.println(x);
    }
}
class inher2 extends inher1
{
    int y;
    inher2(int a,int b)
    {
        super(a);
        y=b;
    }
    void disp1()
     {
        disp();
         System.out.println(y);
    }
}
public class inher3 extends inher2
{
    int z;
    inher3(int a,int b,int c)
    {
        super(a,b);
        z=c;
    }
    void disp2()
    {
        disp1();
        System.out.println(z);
    }
}


