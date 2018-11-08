import java.util.*;
import java.io.*;
public class link2
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
    link2()
    {
       l=new list();
       l1=l;
    }
    
    void insert() throws IOException
    {
        while(y.equalsIgnoreCase("yes")==true)
        {
            System.out.println("Enter data:");
        l1.input();
        System.out.println("yes or no");
        y=in.readLine();
        if(y.equalsIgnoreCase("yes")==true)
        
        {
         l1.next=new list();
         l1=l1.next;
        }
        l1.next=null;
       }
    }
    list l3n; list l4n;
    list l3; list l4;
    void divide(int p)
    {
        l1=l;
        l3=new list();
        l4=new list();
        l3n=l3; l4n=l4;
        int i=0;
        while(i<p)
        {
            l3.n=l1.n;
            l3.next=new list();
            l3=l3.next;
            l1=l1.next;
            i++;
        }
        while(l1!=null)
        {
             l4.n=l1.n;
            l4.next=new list();
            l4=l4.next;
            l1=l1.next;
        }
    }
    void display()
    {
        l3=l3n;
        while(l3!=null)
        {
            System.out.println(l3.n);
        l3=l3.next;
       }
        l4=l4n;
        while(l4!=null)
        {
            System.out.println(l4.n);
        l4=l4.next;
       }
    }
}