package link_list;
import java.io.*;
class linksort
{
    DataInputStream in=new DataInputStream(System.in);
    int k;
    list l1=new list();
    list l2=new list();
    list l=new list();
    void input()throws IOException
    {
        String y="y";
        l1=l;
        while(y.equalsIgnoreCase("y")==true)
        {
            l1.insert();
            System.out.print("Another ");
            y=in.readLine();
            if(y.equalsIgnoreCase("y")==true)
            {
                l1.next=new list();
                l1=l1.next;
            }
        }
        l1.next=null;
    }
    void sort()throws IOException
    {
        l1=l;
        int temp;
        while(l1.next!=null)
        {
            l2=l1.next;
            while(l2!=null)
            {
                if(l1.k>l2.k)
                {
                    temp=l1.k;
                    l1.k=l2.k;
                    l2.k=temp;
                }
                l2=l2.next;
            }
            l1=l1.next;
        }
    }
    void print()throws IOException
    {
        l1=l;
        while(l1!=null)
        {
            l1.show();
            l1=l1.next;
        }
    }
    void main()throws IOException
    {
        input();
        sort();
        print();
    }
}