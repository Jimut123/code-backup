package link.link_stack_queue;
import java.io.*;
class stack1
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
    class stack
    {
        int x;
        void input()throws IOException
        {
           x=Integer.parseInt(br.readLine());
        }
        void disp()
        {
            System.out.println(x);
        }
        stack next;
    }
    stack top;//top1;
    stack1()
    {
      //top=new stack();
      top=null;
      //top1=top;
      
    }
    stack push(stack s)throws IOException
    {
        stack p;
        p=new stack();
        p.input();
        p.next=s;
        s=p;
        return s;
    }
    stack pop(stack s)
    {
        if(s==null)
       {
           System.out.println("Nothing to pop....");
           return s;
        }
        System.out.println("Popped element:");
        s.disp();
        stack p;
        p=new stack();
        p=s.next;
        s=p;
        return s;
    }
    void display(stack s)
    {
       if(s==null)
       {
           System.out.println("Nothing to display....");
           return;
        }
        stack p;
       p=new stack();
        p=s;
        while(p!=null)
        {
            p.disp();
            p=p.next;
        }
    }
     void impl()throws IOException
    {
        int x;
        do
        {
            System.out.println("Press 1 for Push:");
            System.out.println("Press 2 for Pop:");
            System.out.println("Press 3 for Display:");
            System.out.println("Press 4 for Exit:");
            System.out.println("Enter choice:");
            x=Integer.parseInt(br.readLine());
            switch(x)
            {
                case 1:top= push(top);
                        break;
                case 2:top= pop(top);
                        break;
                case 3:display(top);
                       break;
                case 4: System.exit(0);
                        break;
            }
        }while(true);
    }
}