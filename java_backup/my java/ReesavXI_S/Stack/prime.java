package Stack;
import java.util.*;
class prime
{
    int p[]=new int[10];
    int stack[];
    int top;
    int j;
    int k;
    prime()
    {
        top=-1;
        j=0;
        stack=new int[10];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter a prime number ");
            p[i]=sc.nextInt();
        }
    }
    void PUSH()
    {
        if(top<10)
        {
            stack[++top]=p[j++];
        }
        else
        System.out.println("System Overflow ");
    }
    void POP()
    {
        if(top<0)
        System.out.println("System Underflow ");
        else
        System.out.println(stack[top--]);
    }
    void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(stack[i]+" ");
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        input();
        do
        {
            System.out.println("enter 1 push 2 pop 3 display 4 bye ");
            k=sc.nextInt();
            switch(k)
            {
                case 1:
                PUSH();
                break;
                case 2:
                POP();
                break;
                case 3:
                display();
                break;
                case 4:
                System.exit(0);
            }
        }while(true);
    }
}
        