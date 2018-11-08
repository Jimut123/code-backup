import java.io.*;
class stack
{
    int a[]=new int[5];
    int top;
    stack()
    {
        top = 0;
    }
    void push(int d)
    {
        if(top==49)
          System.out.print("Stack overflow");
        else
        {
         a[top]=d;
         top++;
        }
    }
    void pop()
    {
        if(top==0)
        {
            System.out.print("Stack empty");
        }
        else
        top--;
    }
    void display()
    {
        if(top==0)
        {
            System.out.print("Stack empty");
        }
        else
        {
            for(int i=top-1;i>=0;i--)
            {
                System.out.print(a[i]+" ----->");
            }
        }
    }

}
                
                
                
                
                



        