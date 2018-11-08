package link_list;
import java.io.*;
class linkfile
{
    DataInputStream in=new DataInputStream(System.in);
    int k;
    list l1;
    list l=new list();
    void input()throws IOException
    {
        int ch;
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
    void calc()throws IOException
    {
        int ch,f=0;
        l1=l;
        while(l1.next!=null)
        {
            ch=l1.k;
            for(int i=2;i<ch;i++)
            {
                if(ch%i==0)
                f=f+1;
            }
            if(f==0)
            {
                System.out.println(ch);
                f=0;
            }
            l1=l1.next;
        }
    }
    void main()throws IOException
    {
        input();
        calc();
    }
}