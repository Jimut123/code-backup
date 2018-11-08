import java.util.*;
public class stack2
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
        example str;
        example next;
    }
    example ob=new example();
    example ob2=ob;
    example mn;
    void start()
    {
        int ch,fl=0,c=0,c2=0;
        System.out.println("Enter 1 to enter element");
        System.out.println("Enter 2 to delete element");
        System.out.println("Enter 3 to stop");
        mn=ob2;
        while(true)
        {
            System.out.println("Enter choice");
            ch=sc.nextInt();
            fl=0;
            switch(ch)
            {
                case 1:
                c2++;
                        ob2.input();
                        ob2.next=new example();
                        ob2=ob2.next;
                        if(c2>1)
                        {
                            ob2.str=mn;
                            mn=mn.next;
                        }
                        break;
                case 2:
                        ob2=ob2.str;
                        break;
                case 3:
                       ob2=null;
                       ob2=ob;
                       fl=1;
                       break;
                    }
            if(fl==1)
            {
               display();
               break;
            }
        }
    }
    void display()
    {
        ob2=ob;
        while(ob2.a!=0)
        {
            ob2.display();
            ob2=ob2.next;
        }
    }
}