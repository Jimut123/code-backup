package link_list;
import java.io.*;
class linkstack
{
    DataInputStream in=new DataInputStream(System.in);
    int k,cr;
    list l1;
    list l=new list();
    void push()throws IOException
    {
        l1=new list();
        l1.insert();
        l1.next=new list();
        l1.next=l;
        l=l1;
    }
    void pop()throws IOException
    {
        
        //l2=l;
        l.show();
        l=l.next;
    }
    void display()throws IOException
    {
        
        list l2;
        l2=l;
        while(l2.next!=null)
        {
            l2.show();
            l2=l2.next;
        }
    }
    void main()throws IOException
    {
        int ch;
        do
        {
            System.out.print("enter 1 for push 2 for pop 3 for display default for exit ");
            ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                push();
                break;
                case 2:
                pop();
                break;
                case 3:
                display();
                break;
                default:
                System.exit(0);
                break;
            }
        }while(true);
    }
}
                