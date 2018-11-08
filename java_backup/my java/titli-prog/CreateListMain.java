//
import java.util.*;
class CreateListMain
{
    public static void main()
    {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        SingleLinkList obj=new SingleLinkList();
        do
        {
            System.out.println("Enter 1 to add at beginning");
            System.out.println("Enter 2 to add at end");
            System.out.println("Enter 3 to add at middle");
            System.out.println("Enter 4 to search");
            System.out.println("Enter 5 to delete ");
            System.out.println("Enter 6 to show and 7 to exit");
            System.out.println("Enter choice");
            ch=sc.nextInt();
            int d=0,n=0;
            if(ch>=1&&ch<=5)
            {
                System.out.println("Enter data");
                d=sc.nextInt();
            }
            if(ch==1)
            obj.addAtBeg(d);
            else if(ch==2)
            obj.addAtEnd(d);
            else if(ch==3)
            {
                System.out.println("Enter node number");
                obj.addAtMiddle(d,sc.nextInt());
            }
            else if(ch==5)
            obj.delVal(d);
            else if(ch==4)
                System.out.println("Value found at "+obj.search(d));
            else if(ch==6||ch==7)
            obj.show();
            else if(ch<1&&ch>7)
            System.out.println("Wrong choice");
        }while(ch!=7);
     }
}



//class defined for respectine functions
class SingleLinkList
{
    private Node start=null;        
    public void addAtBeg(int d)
    {
        Node temp=new Node(d,start);
        start=temp;             
    }
    public void addAtMiddle(int d,int n)
    {
        Node prev=start;
        for(int i=1;i<n;i++)
            prev=prev.link;
        Node next=prev.link;
        Node temp=new Node(d,next);
        prev.link=temp;
    }


public void addAtEnd(int d)
    {
        Node temp=new Node(d,null);
        if(start==null)
            start=temp;
        else
        {
            Node t=start;            
            while(t.link!=null)
            t=t.link;
            t.link=temp;
        }
    }
    public int search(int val)
    {
        Node t=start;            
        int n=0;
        while(t.link!=null)
        {
            n++;
            if(t.data==val)
            return n;
            else
            t=t.link;
        }
        return -1;
    }
    public void show()
    {
        System.out.print("List.............   ");
        Node t=start;            
        while(t.link!=null)
        {
            System.out.print("  "+t.data);
            t=t.link;
        }
        System.out.println("  "+t.data);
    }
  public void delVal(int val)
    {
        Node prev=start;            
        Node next=prev.link;
        if(prev.data==val)
        {start=next;    return;}
        while(next.data!=val)
        {
                next=next.link;
                prev=prev.link;
        }
        prev.link=next.link;
    }
    public Node retStart()
    {
        return start;
    }
}
