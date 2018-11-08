package assignment;

import java.io.*;
class time_addition
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int h,h1,m,m1,f=1;
    //f=0;
    void input()throws IOException
    {
        while (true)
        {
            System.out.println("enter hour");
            h1=Integer.parseInt(br.readLine());
            
            System.out.println("enter minute");
            m1=Integer.parseInt(br.readLine());
            if(h1<=24)
            {
            if(m1<=60)
            f=0;
            else
            f=1;
        }
        else
        f=1;
            
            if(f==0)
            break;
        }
    }
    time_addition calc(time_addition t1, time_addition t2)
        {
            time_addition t3=new time_addition();
            t3.m1=t1.m1+t2.m1;
            t3.h1=t1.h1+t2.h1;
            if(t3.m1>60)
            {
                t3.m1=t3.m1-60;
                t3.h1=t3.h1+1;
            }
            return t3;
        }
    void disp()
        {
            int f=0;
            int f1=0;
            if(h1>12&&h1<=24)
            {
                h1=h1-12;
                System.out.print("the time is:"+h1+":"+m1+" ");
            }
            else if(h1>24)
            {
                h1=h1-24;
                
            }System.out.print("The Time:"+h1+":"+m1+" ");
        if(h1>=12 && h1<=24)
        f=1;
        else
        f1=1;
        if(f==1)
        System.out.print("P.M");
        else
        System.out.print("A.M");
        }
        void impl()throws IOException
        {
            time_addition a=new time_addition();
            time_addition b=new time_addition();
            time_addition c=new time_addition();
            a.input();
            b.input();
            c=calc(a,b);
            c.disp();
        }
        
    }
            