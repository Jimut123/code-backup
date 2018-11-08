//this class will display Queue functioning
import java.util.*;
class Repeat
{
    private int st[];
    private int cap;
    private int f;
    private int r;
    private int size;
    public Repeat(int m)
    {
        cap=m;
        f=0;
        r=0;
        size=0;
        st=new int[cap];
    }

    public boolean isFull()
    {
        return cap==size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void pushvalue(int v)
    {
        if(isFull()) System.out.println("overflow");
        else
        {
            if(isEmpty()){f=r=0; st[r]=v;}
            else st[++r]=v;
            size++;
        }
    }

    public int popvalue()
    {
        if(isEmpty()) return -9999;
        int c=st[f];
        if(f==r) {f=r=-1; size=0;}
        else{size--; f++;}
        return c;
    }

    public void display()
    {
        System.out.print("| ");
        for(int i=f; i<=r; i++) System.out.print(st[i] + " | ");
        System.out.println();
    }
}

public class Queue
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");              
        Repeat r=new Repeat(sc.nextInt());
        while(true)
        {
            System.out.println("1. Enter elements\n2. Pop elements\n3. Display\n4. Exit");
            switch(sc.nextInt())
            {
                case 1: System.out.print("Enter an element: "); r.pushvalue(sc.nextInt()); break;
                case 2: System.out.println("Popped element: " + r.popvalue()); break;
                case 3: r.display(); break;
                case 4: System.exit(0);
            }
        }
    }
}