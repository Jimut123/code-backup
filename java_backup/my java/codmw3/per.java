import java.util.*;
public class per
{
    Scanner sc=new Scanner(System.in);
    String a,ar[];
    int p[];
    void input()
    {
        int m;
        System.out.println("Enter word");
        a=sc.nextLine();
        ar=new String[a.length()];
        p=new int[a.length()];
        for(m=0;m<5;m++)
        {
            System.out.println();
        }
    }
    void store()
    {
        int m;
        for(m=0;m<a.length();m++)
        {
            ar[m]+=a.charAt(m);
        }
    }
    void strt()
    {
        int c,b;
        String d;
        per ob=new per();
        c=0;
        ob.p=new int[this.p.length];
        ob.a=this.a;
        for(b=0;b<a.length();b++)
        {
            d="";
            d+=a.charAt(b);
           ob.p[0]=b;
            get(d,ob,c);
        }
    }
    void get(String d,per k,int i)
    {
        per ob=new per();
        ob.a=k.a;
        ob.p=k.p;
        int m,n,fl;
        String d2="";
        for(m=0;m<a.length();m++)
        {
            d2=d;
            fl=0;
            ob.p=k.p;
            for(n=0;n<=i;n++)
            {
                if(k.p[n]==m)
                {
                    fl=1;
                    break;
                }
            }
            if(fl==0)
            {
                d2+=a.charAt(m);
                k.p[i+1]=m;
               if(d2.length()==a.length() && i!=a.length())
                {
                  System.out.println(d2);
                }
                get(d2,k,i+1);
            }
        }
        /*if(d2.length()==a.length() && i!=a.length())
        {
            System.out.println(d2);
        }
        */
    }
    void main()
    {
        input();
        store();
        strt();
    }
}    