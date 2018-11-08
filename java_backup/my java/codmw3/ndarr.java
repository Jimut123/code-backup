import java.util.*;
public class ndarr
{
    Scanner sc=new Scanner(System.in);
    class nd
    {
        int x;
        void input()
        {
            System.out.println("Enter number");
            x=sc.nextInt();
        }
        nd a=null;
    }
    nd ob=new nd();
    nd ob2=ob;
    void start()
    {
        int ch;
        System.out.println("Enter 1 to stop");
        ch=0;
        while(ch!=1)
        {
            ob2.input();
            ob2.a=new nd();
            ob2=ob2.a;
            System.out.println("Enter choice");
            ch=sc.nextInt();
            if(ch==1)
            {
                ob2=null;
                break;
            }
        }
        ob2=ob;
        while(ob2.a!=null)
        {
            arr(ob2);
            display();
            System.out.println();
            if(ob2.a.a==null)
            {
                break;
            }
            ob2=ob2.a;
        }
    }
    void arr(nd k)
    {
      int j,h,l;
        nd str1=k,str2=k,str3;
        str3=k;  
        h=l=k.x;
        while(k!=null)
        {
            if(k.x>h)
            {
                str1=k;
                h=k.x;
            }
            else if(k.x<l)
            {
                str2=k;
                l=k.x;
            }
            k=k.a;
        }
        j=str3.x;
        str3.x=str1.x;
        str1.x=j;
        
        j=str3.a.x;
        str3.a.x=str1.x;
        str1.x=j;    
    }
    void display()
    {
        ob2=ob;
        while(ob2.a!=null)
        {
            System.out.println(+ob2.x);
            ob2=ob2.a;
        }
    }
}