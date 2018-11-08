import java.util.*;
public class subtraction
{
    void main()
    {
        Scanner sc=new Scanner(System.in);  
        String a,b,d="",i="",k="",g="",h="";
        int c,e=0,cr=0;
        System.out.println("Enter number 1 ");
        a=sc.nextLine();
        System.out.println("Enter number 2");
        b=sc.nextLine();
        if(a.length()>b.length())
        {
            d=b;
            i=a;
            e=a.length()-b.length();
        }
        else
        {
            d=a;
            i=b;
            e=b.length()-a.length();
        }
        a="";
        for(c=0;c<e;c=c+1)
        {
            k=k+0;
        }
        k=k+d;
        for(c=0;c<k.length();c=c+1)
        {
            if(k.charAt(c)=='1')
            {
                a=a+0;
            }
            else
            {
                a=a+1;
            }
        }
        cr=0;
        for(c=0;c<k.length();c=c+1)
        {
        if(cr==0 && a.charAt(c)=='1')
        {
            g=g+1;
            cr=0;
        }
        else if(cr==0 && a.charAt(c)=='0')
        {
            g=g+0;
            cr=0;
        }
        else if(cr==1 && a.charAt(c)=='0')
        {
            g=g+1;
            cr=0;
        }
        else if(cr==1 && a.charAt(c)=='1')
        {
            g=g+1;
            cr=0;
        }
        }
        cr=0;
        for(c=g.length()-1;c>=0;c=c-1)
        {
            if(cr==0 && g.charAt(c)=='0' && i.charAt(c)=='0')
            {
                cr=0;
                h=h+0;
                
            }   
            else if(cr==0 && g.charAt(c)=='1' && i.charAt(c)=='0')
            {
                cr=0;
                h=h+1;
            }
            else if(cr==0 && g.charAt(c)=='1' && i.charAt(c)=='1')
            {
                cr=1;
                h=h+0;
            }
            else if(cr==1 && g.charAt(c)=='1' && i.charAt(c)=='1')
            {
                cr=1;
                h=h+1;
            }
            else if(cr==1 && g.charAt(c)=='0' && i.charAt(c)=='1')
                {
                    cr=1;
                    h=h+0;
                }
               else if(cr==0 && g.charAt(c)=='0' && i.charAt(c)=='1')
               {
                   cr=0;
                   h=h+1;
                }
                else if(cr==1 && g.charAt(c)=='1' && i.charAt(c)=='0')
                {
                    cr=0;
                    h=h+0;
                }
                else if(cr==1 && g.charAt(c)=='0' && i.charAt(c)=='0')
                {
                    cr=0;
                    h=h+1;
                }
            }g="";          
            if(cr==0)
            {
                for(c=h.length()-1;c>=0;c=c-1)
                {
                    if(h.charAt(c)=='1')
                    {
                        System.out.print("0");
                        
                    }
                    else
                    {
                        System.out.print("1");
                    }
                }
            }
            else
            {
                System.out.print(h);
            }
        }
    }
                
                        
                    
        
            