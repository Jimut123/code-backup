import java.util.*;
public class test2
{
   int cc=0;
   example ob=new example();
    example ob2=ob;
    example mn;
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
        example str=ob;
    }
    void start()
    {
        int ch;
        mn=ob2;
        while(true)
        {
            System.out.println("Enter choice");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        cc=cc+1;
                        ob2.input();
                        ob2.next=new example();
                        if(cc>1)
                        {
                            ob2.str=mn;
                            mn=mn.next;
                        }
                        ob2=ob2.next;
                        break;
                        
                        case 2:
                        ob2=ob2.str;
                        cc=cc-1;
                        mn=ob2;
                        break;
                        
                        case 3:
                        ch=4;
                        break;
                
            }
            if(ch==4)
            {
                break;
            }
        }
        display();
    }
        void display()
        {
            int  c=0;
            ob2=ob;
            while(c!=cc)
            {
                ob2.display();
                ob2=ob2.next;
                c=c+1;
                if(c==cc)
                {
                    break;
                }
                System.out.println();
            }
    }
    }
            