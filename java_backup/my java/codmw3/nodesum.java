import java.util.*;
public class nodesum
{
    Scanner sc=new Scanner(System.in);
    class node
    {
        int x;
        void input()
        {
            System.out.println("Enter number");
            x=sc.nextInt();
        }
        node a1;
    }
    node a2=new node();
    node a3;
    void start()
    {
        int sum=0,ch=0;
        System.out.println("Enter 1 to stop");
        a3=a2;
        while(ch!=1)
        {
           a3.input();
           System.out.println("Enter choice");
           ch=sc.nextInt();
           if(ch==1)
           {
               sum+=a3.x;
               a3.a1=null;
           }
           a3.a1=new node();
           a3=a3.a1;
        }
        sum+=a2.x;
        //System.out.println(sum);
        a3=a2;
        int f=0;
        while(a3.a1!=null)
        {
            //System.out.println("value:"+a3.x);
            if(sum==a3.x)
            {
                f=1;
                break;
            }
            a3=a3.a1;
        }
        if(f==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}