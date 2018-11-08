package Apc;
import java.io.*;
class swap
{
    void swap1(int a,int b)
    {
        if(a>b)
        {
            a=a-b;
            b=a+b;
            a=b-a;
        }
        else if(b>a)
        {
            b=b-a;
            a=b+a;
            b=a-b;
        }
        System.out.println("Swapped values are:"+a+" "+b);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter two numbers:");
        int a1 = Integer.parseInt(cd.readLine());
        int b1 = Integer.parseInt(cd.readLine());
        swap ob = new swap();
        ob.swap1(a1,b1);
    }
}
        