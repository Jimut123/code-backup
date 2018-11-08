import java.util.*;
class bin_sub
{
    int n=0,n1=0;
    bin_sub(int num,int num1)
    {
        n=num;
        n1=num1;
    }
    void clac()
    {
        int x=0,y=0;
        x=bin_conv(n);
        y=bin_conv(n1);
        int z=0;
        z=x-y;
        String ans=" ";
        ans=dec_conv(z);
        System.out.println(n+"-"+n1+" ="+ans);
        System.out.println(x+"-"+y+" ="+z);
    }
    int bin_conv(int c)
    {
        int m=1,s=0,a=0,i=0;
        while(c>0)
        {
            a=c%10;
            m=a*(int)Math.pow(2,i);
            s=s+m;
            i=i+1;
            c=c/10;
        }
        return s;
    }
    String dec_conv(int d)
    {
        int a=0,i=0;
        String s=" ";
        String z=" ";
        while(d>0)
        {
            a=d%2;
            s=s+a;
            d=d/2;
        }
        for(i=s.length()-1;i>=0;i--)
        z=z+s.charAt(i);
        return z;
    }
}