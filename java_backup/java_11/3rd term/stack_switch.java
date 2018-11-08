import java.io.*;
class stack_switch
{
    int a[]=new int[5];
    int top;
    stack_switch()
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
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        stack_switch ob = new stack_switch();
        int n2,n3;
        do
        {
        System.out.println("Enter 1 for push 2 for pop and 3 for display.");
       n2=Integer.parseInt(cd.readLine());
        
        switch(n2)
        {
           case 1:
           
             System.out.println("Enter a no.");
              n3=Integer.parseInt(cd.readLine());
             ob.push(n3);
             break;
           case 2:
           
               ob.pop();
              break;
           case 3:
           
               ob.display();
               break;
           default:System.out.println("Wrong choice");
        }
    }
    while(n2!=0);
    }
}
                
                
                
                
                



        