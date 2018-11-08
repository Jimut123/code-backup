package Stack;
import java.io.*;
class stack
{
   DataInputStream in=new DataInputStream(System.in);
    int limit; int top=-1;int top2=-1;
    String a1[];
    String a2[];
    void input() throws IOException
    {
        System.out.println("limit");
        limit=Integer.parseInt(in.readLine());
        a1=new String[limit];
        a2=new String[limit];
    }
    void push() throws IOException
    {
        if(top>=limit-1)
        {
            --top;
        System.out.println("overflow");
    }
        else
        {
            System.out.println("enter");
            a1[++top]=in.readLine();
        }
    }
    void pop1()
    {
        a2[++top2]=a1[top--];
    }
    void pop2()
    {
        a1[top++]=a2[top2--];
    }
    void impl() throws IOException
    {
        input();
        outer:
        for(;;)
        {
            System.out.println("1-push 2-over");
            switch(Integer.parseInt(in.readLine()))
            {
                case 1:
                push();
                break;
                case 2:
                break outer;
            }
        }
        System.out.println("car vehicle u wanna remove");
        String j=in.readLine();
        int p=0;
        //top--;
        for(int i=limit-1;i>=0;i--)
        {
            pop1();
            p++;
            if(a1[top].equalsIgnoreCase(j)==true)
            {
               System.out.println(top);
                break;
            }
            //top--;
        }
        for(int i=0;i<p;i++)
        {
            pop2();
        }
        for(int i=limit-2;i>=0;i--)
        {
            System.out.println(a1[i]);
        }
    }
}
        
    
