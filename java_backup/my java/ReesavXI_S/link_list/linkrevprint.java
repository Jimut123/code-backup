package link_list;
import java.io.*;
class linkrevprint
{
    DataInputStream in=new DataInputStream(System.in);
    int k;
    int cr=0;
    list l1=new list();
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
    void check()throws IOException
    {
        l1=l;
            while(l1!=null)
            {
                cr=cr+1;
                l1=l1.next;
            }
            print(cr);
    }
    void print(int cr)throws IOException
    {
        int x;
        x=0;
        l1=l;
        if(cr<0)
        {
            System.exit(0);
        }
        else
        {
            while(l1!=null)
            {
                if(x==cr)
                l1.show();
                l1=l1.next;
                x=x+1;
            }
            print(cr-1);
        }
    }
    void main()throws IOException
    {
        input();
        check();
    }
}