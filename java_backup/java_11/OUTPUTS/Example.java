import java.io.*;
class Example 
{
    int a,b;
    void FUN(Example A)
    {
        A.a=A.a+A.b;
        A.b=A.a-A.b;
        A.a=A.a-A.b;
    }
    public void main()
    {
        Example obj = new Example();
        obj.a=4;
        obj.b=18;
        System.out.println(obj.a+" "+obj.b);
        FUN(obj);
        System.out.println(obj.a+" "+obj.b);
    }
}