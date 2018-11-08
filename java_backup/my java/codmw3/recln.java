import java.util.*;
public class recln
{
    Scanner sc=new Scanner(System.in);
    class lt
    {
        int x;
        void input()
        {
            System.out.println("Enter number");
            x=sc.nextInt();
        }
        lt ob;
    }
    lt a1=new lt();
    lt a2=a1;
    void start()
    {
        a2.input();
        a2.ob=new lt();
        a2=a2.ob;
        int ch;
        System.out.println("Enter choice");
        ch=0;
        ch=sc.nextInt();
        if(ch!=1)
        {
            start();
        }
        return;
    }
    void main()
    {
        System.out.println("Enter 1 to stop");
        start();
    }
}