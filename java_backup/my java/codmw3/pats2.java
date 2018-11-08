import java.util.*;
public class pats2
{
    Scanner sc=new Scanner(System.in);
    String a;
    void input()
    {
        System.out.println("Enter code");
        a=sc.nextLine();
        conv();
    }
    void conv()
    {
        int b;
        String c="",k="",l="";
        for(b=0;b<a.length();b++)
        {
            
            if(a.charAt(b)=='*')
            {
                l=""+'*';
            }
             if(a.charAt(b)=='#')
            {
               l=""+'#';
            }
            else if(a.charAt(b)=='!')
            {
                l=""+'!';
            }
             if(b!=0 && a.charAt(b)!=c.charAt(0))
            {
                k+=conv2(c);
                c=""+a.charAt(b);
                continue;
            }
            c+=l;
        }
        k+=conv2(c);
        System.out.println(k);
    }
    String conv2(String m)
    {
        String d;
        int b,n;
        b=m.length();
        d="";
        for(n=1;n<=b/2;n++)
        {
            if(m.charAt(0)=='*')
            {
                d+='A';
            }
             if(m.charAt(0)=='#')
            {
                d+='Z';
            }
             if(m.charAt(0)=='!')
            {
                d+=' ';
            }
        }
         if(b%2==1)
            {
                 if(m.charAt(0)=='*')
            {
                d+='a';
            }
             if(m.charAt(0)=='#')
            {
                d+='z';
            }
             if(m.charAt(0)=='!')
            {
                d+=' ';
            }
        }
         return d;
       }
    }