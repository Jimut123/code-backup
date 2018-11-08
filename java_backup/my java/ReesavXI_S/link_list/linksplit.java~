package link_list;
import java.io.*;
class linksplit
{
    DataInputStream in=new DataInputStream(System.in);
    list l1;
    list l=new list();
    int n;
    void input()throws IOException
    {
        int ch=0;
        l1=l;
        l1.insert();
        System.out.print("Enter 1 to enter more numbers ");
        do
        {
            ch=Integer.parseInt(in.readLine());
            if(ch==1)
            {
                l1.next=new list();
                l1=l1.next;
                l1.insert();
            }
            }while(ch==1);
    }
    void check()throws IOException
    {
        System.out.print("Enter splitting point ");
        n=Integer.parseInt(in.readLine());
        System.out.println("First list ");
        int cr=0;
        while(l1.next!=null)
        {
            l1=l;
            while(cr<n)
            {
                cr=cr+1;
                l1.show();
                l1=l1.next;
            }
            if(cr==n)
            System.out.println("Second list ");
            l1.show();
            l1=l1.next;
        }
    }
}
            