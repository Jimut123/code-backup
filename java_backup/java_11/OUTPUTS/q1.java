import java.io.*;
class q1
{
    public static void main()
    {
    int v1=5,v2=10;
    for(int x=1;x<=2;x++)
    {
        System.out.println((++v1)+"\t"+(v2--));
        System.out.println((--v2)+"\t"+(v1++));
    }
    }
}