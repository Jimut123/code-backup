import java.util.*;
public class triplets
{
    Scanner sc=new Scanner(System.in);
    int ar[]=new int[100];
    void input()
    {
       
        int b;
        for(b=1;b<=100;b++)
        {
            ar[b-1]=b;
        }
    }
    void st1(int a)
    {
        if(a==100)
        {
            return;
        }
        else
        {
            st2(a,0);
            st1(a+1);
        }
    }
    void st2(int a,int b)
    {
        if(b!=a)
        {
            if(b==100)
            {
                return;
            }
            else
            {
                st3(a,b,0);
                st2(a,b+1);
            }
        }
        else
        {
            st2(a,b+1);
        }
    }
    void st3(int a,int b,int c)
    {
        if(c==100)
        {
            return;
        }
        if(c!=a && c!=b)
        {
            if(ar[a]+ar[b]+ar[c]==100)
            {
                System.out.println(+ar[a]+" "+ar[b]+" "+ar[c]);
            }
            st3(a,b,c+1);
        }
        else if(c==100)
        {
            return;
        }
    }
}           