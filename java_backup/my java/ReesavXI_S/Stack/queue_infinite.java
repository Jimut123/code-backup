package Stack;
import java.util.*;
class queue_infinite
{
    int q[];
    int f;
    int r;
    queue_infinite()
    {
        f=0;r=0;
        q=new int[10];
    }
    void PUSH()
    {
        Scanner sc=new Scanner(System.in);
        if(r==10)
        System.out.println("System Overflow ");
        else
        {
            System.out.print("Enter element ");
            q[r++]=sc.nextInt();
        }
    }
    void POP()
    {
        System.out.println(q[f]+" ");
        q[r++]=q[f++];
    }
    void display()
    {
        System.out.println("QUEUE");
        for(int g=f;g<r;g++)
        {
            System.out.println(q[g]);
        }
    }
   void main()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("Enter 1 for insert 2 for del 3 for display 4 for exit ");
        int r=sc.nextInt();
        switch(r)
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
    }
        while(true);
    }
}