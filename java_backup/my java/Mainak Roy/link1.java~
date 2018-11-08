import java.util.*;
import java.io.*;
public class link1
{
    Scanner sc=new Scanner(System.in);
    DataInputStream in=new DataInputStream(System.in);
    class list
    {
        int n;
        void input()
        {
                n=sc.nextInt();
        }
        void display()
        {
                System.out.println(n);
        }
        list next;
    }
    String y="yes";
    list l,l1;
    link1()
    {
       l=new list();
       l1=l;
    }
    void insert() throws IOException
    {
        while(y.equalsIgnoreCase("yes")==true)
        {
        System.out.println("enter position");
        int pos=sc.nextInt();
        l1=l;
        for(int i=0;i<pos;i++){
        
        l1.next=new list();
        l1=l1.next;
        }
        System.out.println("Enter data:");
        l1.input();
        
        System.out.println("yes or no");
        y=in.readLine();
        if(y.equalsIgnoreCase("yes")==true)
        
        {
         l1.next=new list();
         l1=l1.next;
        }
        
       }
       l1.next=null;
    }
    void display()
    {
        l1=l;
        while(l1!=null)
        {
            System.out.println(l1.n);
        l1=l1.next;
       }
    }
}
        