package Apc;
import java.io.*;
class Ternary_max
{
    public static void main(String args[])
    {
        int a=5,b=3,c=9,max;
        max=((a>b)&&(a>c))?a:((b>c)&&(b>a))?b:c;
        System.out.println("Maximum: "+max);
    }
}
