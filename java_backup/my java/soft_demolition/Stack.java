//this class implements stack using ararys
import java.util.*;
class StackFunctions
{
    private int arr[];
    private int ctr;
    public StackFunctions()
    {
        arr=new int[0];
        ctr=-1;
    }

    public StackFunctions(int capacity)
    {
        arr=new int[capacity];
        ctr=-1;
    }

    public boolean isEmpty()
    {
        return ctr==-1;
    }

    public void push(int n)
    {
        if(ctr+1<arr.length)
            arr[++ctr]=n;
        else System.out.println("Error: Stack Overflow");
    }

    public int pop()
    {
        if(isEmpty()) return -(int)Math.pow(2, 31);
        else return arr[ctr--];
    }
}

public class Stack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        StackFunctions s=new StackFunctions(sc.nextInt());
        while(true)
        {
            System.out.print("\n1. Push\n2. Pop\n3. Exit\nEnter your choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter an element to push: ");
                    s.push(sc.nextInt());
                    break;
                }

                case 2:
                {
                    int elem=s.pop();
                    if(elem==-(int)Math.pow(2, 31))
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Popped element: "+elem);
                    break;
                }

                case 3: System.exit(0);
            }

        }
    }
}