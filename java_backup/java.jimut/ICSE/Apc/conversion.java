package Apc;
import java.io.*;
class conversion
{
    public static void main(String args[])
    {
        System.out.println("\f");
        int i,s=0;
        for(i=1;i<=10;s=s+i,i++)
        {
            System.out.println("i="+i+" s= "+s);
        }
        i=1;
        s=0;
        do
        {
            System.out.println("i="+i+" s= "+s);
            s=s+i;
            i++;
        }
        while(i<=10);
    }
}
        