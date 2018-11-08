import java.util.*;
public class tests
{
    Scanner sc=new Scanner(System.in);
    
    class example
    {
        int a=0;
        void input()
        {
            System.out.println("Enter number");
            a=sc.nextInt();
        }
        void display()
        {
            System.out.println(+a);
        }
        example next;
        example str;
    }
    example ob=new example();
    example ob2=ob;
    example mn;
    void start()
    {
        int cc=0;
        mn=ob2;
        while(true)
        {
            cc++;
            
            ob2.input();
            ob2.next=new example();
            if(ob2.a==0)
            {
                ob2=null;
                break;
            }
            
            ob2=ob2.next;
            if(cc>1)
            {
            ob2.str=mn;
            mn=mn.next;
            }
        }
        display();
        }
        void display()
        {
            ob2=ob;
            while(ob2.next!=null)
            {
                ob2.display();
                ob2=ob2.next;
                if(ob2.str!=null)
                ob2.str.display();
                System.out.println();
            }
        }
    }
            