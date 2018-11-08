package Stack;
import java.util.*;
class D_Q
{
    int q[],f,r,i,k;
    D_Q()
    {
        q=new int[100];
        f=r=-1;
    }
    void insert_rear()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        k=sc.nextInt();
        if(r>=100)
        {
            System.out.println("Stack Overflow");
            return;
        }
        else
        {
            if(f<0)
            {
                q[++f]=k;
                r++;
            }
            else
            q[++r]=k;
        }
    }
    void del_front()
    {
        if(r==-1)
        {
            System.out.println("Queue underflow ");
            return;
        }
        else
        {
            System.out.println("Popped element"+q[f]);
            f++;
        }
    }
    void del_rear()
    {
        if(r<0)
        System.out.println("Stack underflow");
        System.out.println("Popped element "+q[r]);
        r--;
    }
    void insert_front()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        k=sc.nextInt();
        if(f<0)
        {
            q[++f]=k;
            r++;
        }
        else
        {
        int j=r;
        for(i=(r+1);i>=1;i--)
        {
            q[i]=q[j--];
        }
        q[0]=k;
        }
    }
    void display()
    {
        for(int x=f;x<=r;x++)
        System.out.println(q[x]);
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for insfront 2 for insback 3 for delfront 4 for delback 5 for display");
        do
        {
            switch(sc.nextInt())
            {
                case 1:
                insert_front();
                break;
                case 2:
                insert_rear();
                break;
                case 3:
                del_front();
                break;
                case 4:
                del_rear();
                break;
                case 5:
                display();
                break;
                default:
                System.exit(0);
            }
        }while(true);
    }
}

            