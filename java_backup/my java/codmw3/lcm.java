import java.io.*;
public class lcm
{
    int l=0,c=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public class accept
    {
        int a;
        void input()throws IOException
        {
            System.out.println("Enter number");
            a=Integer.parseInt(br.readLine());
        }
        accept next;
    }
    accept ob=new accept();
    accept ob2=ob;
    void start()throws IOException
    {
        String s;
        System.out.println("Enter n stop");
        while(true)
        {
            System.out.println("Do you want to continue");
            s=br.readLine();
            if(s.equals("N"))
            {
                ob2=null;
            }
            else
            {
                ob2.input();
                c++;
                if(ob2.a>l)
                {
                    l=ob2.a;
                }
                ob2.next=new accept();
                ob2=ob2.next;
            }
        }
    }
    void check()throws IOException
    {
        int c2=0,fl,fl2,m,n,lc=1;
        for(m=0;m<l;m++)
        {
            ob2=ob;
            fl=0;
            fl2=0;
            c2=0;
            for(n=0;n<c;n++)
                {
                    if(ob2.a%m==0 && fl==0)
                    {
                        ob2.a=ob2.a/n;
                        lc=lc*m;
                    }
                    else if(ob2.a%m==0 && fl==1)
                    {
                        ob2.a=ob2.a%m;
                        lc=lc*m;
                    }
                    if(ob2.a==1)
                    {
                        c2++;
                    }
                }
            if(c2==c)
            {
                    break;
            }
            }
            System.out.println("THE LCM IS "+lc);
        } 
    }
                        