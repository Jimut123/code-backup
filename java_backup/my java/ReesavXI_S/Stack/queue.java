package Stack;
import java.util.*;
class queue
{
    int q[],f,r,k,i,s[];
    queue()
    {
        q=new int[10];
        s=new int[10];
        f=-1;
    }
    void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        k=sc.nextInt();
        if(r>=10)
        {
            System.out.print("Queue full");
            return;
        }
        else
        {
            if(f<0)
            {
                q[++f]=k;
                
            }
            else
            q[++r]=k;
        }
    }
    void del()
    {
        System.out.println("Popped element = "+q[f]);
        s[i]=q[f];
        f++;
        i++;
    }
    void display()
    {
        System.out.println("QUEUE");
        for(int g=f;g<=r;g++)
        {
            System.out.println(q[g]);
        }
        System.out.println("STACK");
        for(int y=0;y<i;y++)
        {
            System.out.println(s[y]);
        }
    }
    void revive()
    {
        q[++r]=s[--i];
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("Enter 1 for insert 2 for del 3 for display 4 for revive ");
        int r=sc.nextInt();
        switch(r)
        {
            case 1:
            insert();
            break;
            case 2:
            del();
            break;
            case 3:
            display();
            break;
            case 4:
            revive();
            break;
            case 5:
            System.exit(0);
        }
    }
        while(true);
    }
}
        
        