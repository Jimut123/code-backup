package link_list;
import java.io.*;
class linkeven
{
    DataInputStream in=new DataInputStream(System.in);
    list l1=new list();
    list l=new list();
    String y="yes";
    void input()throws IOException
    {
        l1=l;
        while(y.equalsIgnoreCase("yes")==true)
        {
            l1.insert();
            System.out.print("Another ");
            y=in.readLine();
            if(y.equalsIgnoreCase("yes")==true)
            {
                l1.next=new list();
                l1=l1.next;
            }
        }
        l1.next=null;
    }
    void check()throws IOException
    {
        l1=l;
        int cr;
        cr=0;
        while(l1.next!=null)
        {
            cr=cr+1;
            if(cr%2==1)
            l1.show();
            l1=l1.next;
        }
    }
    void main()throws IOException
    {
        input();
        check();
    }
}

        