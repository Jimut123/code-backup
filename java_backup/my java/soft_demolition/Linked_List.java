//this class will utilize the basic functions of Linked List
import java.util.*;
class Node
{
    private int data;
    private Node link;//address of next node; self-referrential data structure
    public Node()
    {
        data=0;
        link=null;        
    }

    public Node(int d, Node l)
    {
        data=d;
        link=l;
    }

    public void setLink(Node l)
    {
        link=l;
    }

    public void setData(int d)
    {
        data=d;
    }

    public int getData()
    {
        return data;
    }

    public Node getLink()
    {
        return link;
    }
}

class SingleLinkedList
{
    private Node start;
    public SingleLinkedList()
    {
        start=null;
    }

    public void insertAtBeg(int d)
    {
        Node temp;
        if(start==null) temp=new Node(d, null);
        else temp=new Node(d, start);
        start=temp;
    }

    public void insertAtMid(int d, int nodeNo)
    {
        if(nodeNo>=countNodes())
            System.out.println("Insertion is not possible");
        else
        {
            Node temp=new Node(d, null);
            Node t=start;
            int c=0;
            while(t!=null)
            {
                c++;
                if(c==nodeNo)
                { 
                    temp.setLink(t.getLink());
                    t.setLink(temp);
                    break;
                }
                t=t.getLink();
            }
        }
    }

    public void insertAtEnd(int d)
    {
        Node temp=new Node(d, null);
        if(start==null)//no existing node
            start=temp;
        else 
        {
            Node t=start;
            while(t.getLink()!=null)//traversing till the last node
                t=t.getLink();
            t.setLink(temp);
        }
    }

    public void delete(int d)
    {
        if(start.getData()==d)
        {
            start=start.getLink();
            return;
        }
        else
        {
            Node ptr, prev;
            for(ptr=prev=start; ptr!=null; prev=ptr, ptr=ptr.getLink())
            {
                if(ptr.getData()==d)
                {
                    prev.setLink(ptr.getLink());
                    return;
                }
            }
        }
    }

    public void search(int d)
    {
        Node t=start;
        int cnt=0;
        boolean flag=false;
        while(t!=null)
        {
            cnt++;
            if(t.getData()==d)
            {
                System.out.println(d + " was found at position #" + cnt);
                flag=true;
            }
            t=t.getLink();
        }        
        if(!flag) System.out.println("The Node you searched for was not found in the Linked List");
    }

    public void display()
    {
        Node t=start;
        System.out.print("| ");
        while(t!=null)
        {
            System.out.print(t.getData() + " |  ");
            t=t.getLink();
        }
        System.out.println();
    }

    public int countNodes()
    {
        Node t=start;
        int c=0;
        while(t!=null)
        {
            t=t.getLink();
            c++;
        }
        return c;
    }
}

public class Linked_List
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SingleLinkedList sls=new SingleLinkedList();

        while(true)
        {
            System.out.println("\nEnter your choice from below: ");
            System.out.println("1. Insert Nodes \n2. Delete a Node \n3. Search the Linked List for an element \n4. Display the Linked List \n5. Exit");
            switch(sc.nextInt())
            {
                case 1:
                {
                    System.out.println("Where would you like to insert the Node(s)? \n1. Beginning (one Node at a time) \n2. Middle \n3. End");
                    int ch=sc.nextInt();
                    int no=0, pos=0;
                    switch(ch)
                    {
                        case 1: System.out.print("Enter the data: ");
                                sls.insertAtBeg(sc.nextInt());
                                break;

                        case 2: System.out.print("Enter number of nodes you want to enter: ");
                                no=sc.nextInt();
                                System.out.print("Enter the position after which you want to enter: ");
                                pos=sc.nextInt();
                                int count=1;
                                for(int i=1; i<=no; i++)
                                {
                                    System.out.print("Enter data for Node #" + (i+count++) + ": ");
                                    int data=sc.nextInt();
                                    sls.insertAtMid(data, pos++);
                                }
                                break;

                        case 3: System.out.print("Enter number of nodes you want to enter: ");
                                no=sc.nextInt();
                                pos=sls.countNodes();
                                for(int i=1; i<=no; i++)
                                {
                                    System.out.print("Enter data for Node #" + (i+pos) + ": ");
                                    int data=sc.nextInt();
                                    sls.insertAtEnd(data);
                                }
                                break;
                    }
                    break;
                }

                case 2:
                {
                    System.out.print("Enter the data you want to remove (first instance will be removed): ");
                    sls.delete(sc.nextInt());
                    break;
                }

                case 3:
                {
                    System.out.print("Enter the data you wish to search for: ");
                    sls.search(sc.nextInt());
                    break;
                }

                case 4: sls.display(); break;

                case 5: System.exit(0);
            }
        }
    }
}
