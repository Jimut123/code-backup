package link_list;
import java.io.*;
class linkintro
{
    String s="";
    int i;
    list l1=new list();
    list l=new list(); 
   class list
    {
        char c;
        void insert(char ch)
        {
            c=ch;
        }
        void show()
        {
            System.out.println(c);
        }
        list next;
    }
    void input_string()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.print("Enter a string ");
        s=in.readLine();
        l1=l;
    }
    int lim=0;
    void input()throws IOException
    {
        lim=s.length();
        while(i<lim)
        {
            l1.insert(s.charAt(i++));
            l1.next=new list();
            l1=l1.next;
        }
        l1.next=null;
    }
    void display()
    {
        l1=l;
        while(l1!=null)
        {
            l1.show();
            l1=l1.next;
        }
    }
}