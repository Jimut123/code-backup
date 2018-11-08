import java.io.*;
public class prac
{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class lt
    {
        int a;
        void input()throws IOException
        {
            System.out.println("Enter number");
            a=Integer.parseInt(br.readLine());
        }
        lt ob;
    }
    lt b1=new lt();
    lt b2=b1;
    void start()throws IOException
    {
        String ch="";
        while(true)
        {
            System.out.println("Do you want to continue?");
            ch=br.readLine();
            if(ch.equals("n"))
            {
                b2=null;
                break;
            }
            b2.input();
            b2.ob=new lt();
            b2=b2.ob;
        }
    }
    int prime(int a)
    {
        int m,fl=1;
        for(m=2;m<=a/2;m++)
        {
            fl=1;
            if(a%m==0)
            {
                fl=0;
                break;
            }
        }
        return fl;
    }
    void sort()
    {
        int fl1=0,fl2=0,i;
        lt k=b1;
        b2=b1;
        while(k!=null)
        {
            b2=b1;
            while(b2.ob!=null)
            {
                fl1=prime(b2.a);
                fl2=prime(b2.ob.a);
                if(fl1==fl2)
                {
                    b2=b2.ob;
                }
                else if(fl1==1 && fl2==0)
                {
                    i=b2.a;
                    b2.a=b2.ob.a;
                    b2.ob.a=i;
                }
                b2=b2.ob;
            }
            k=k.ob;
        }
    }
    void display()
    {
        b2=b1;
        while(b2!=null)
        {
            System.out.println(+b2.a);
            b2=b2.ob;
        }
    }
}
                
     