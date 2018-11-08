package link_list;
import java.io.*;
class linknodecount
{
    DataInputStream in=new DataInputStream(System.in);
    int k;
    list l1;
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
        int cr=0;
        while(l1!=null)
        {
            //System.out.println("cr");
        cr=cr+1;
        l1=l1.next;
    }
        System.out.print("The number of nodes "+cr);
    }
    void main()throws IOException
    {
        input();
        check();
    }
}