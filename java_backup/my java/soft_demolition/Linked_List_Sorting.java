//sorting of a linked list
import java.util.*;
class Node
{
    private Node link;
    private int roll;
    private String name;
    private double avg;

    public Node()
    {
        link=null;
        roll=0;
        name="";
        avg=0.0;
    }

    public Node(Node l, int r, String n, double average)
    {
        link=l;
        roll=r;
        name=n;
        avg=average;
    }

    /**Set methods*/
    public void setLink(Node l)
    {
        link=l;
    }

    public void setName(String n)
    {
        name=n;
    }

    public void setRollNo(int rollNo)
    {
        roll=rollNo;
    }

    public void setAverage(double average)
    {
        avg=average;
    }

    /**Get methods*/
    public Node getLink()
    {
        return link;
    }

    public String getName()
    {
        return name;
    }

    public int getRollNo()
    {
        return roll;
    }

    public double getAverage()
    {
        return avg;
    }
}

class LinkedListOperations
{
    private Node start;
    public LinkedListOperations()
    {
        start=null;
    }
    
    public void insert(String name, double avg, int roll)
    {
        Node temp;
        if(start==null) temp=new Node(null, roll, name, avg);
        else temp=new Node(start, roll, name, avg);
        start=temp;
    }

    public void displayAll()
    {
        Node t=start;
        int c=countNodes();
        System.out.println("\nThe current list of students is as follows:");
        while(t!=null)
        {
            System.out.println("\nStudent #" + c-- + ":");           
            System.out.print("Name: " + t.getName());
            System.out.println("\t(Roll number: " + t.getRollNo() + ")");
            System.out.println("Average: " + t.getAverage());
            t=t.getLink();
        }
        System.out.println();
    }

    public int countNodes()
    {
        Node t=start;
        int c=0;
        while(t!=null)
        {
            t=t.getLink();
            c++;
        }
        return c;
    }    

    public void displayLimit(int limit)
    {
        Node t=start;
        int c=1;
        while(c<=limit && t!=null)
        {
            System.out.println("\n#" + c++ + ":");            
            System.out.print("Name: " + t.getName());
            System.out.println("\t(Roll number: " + t.getRollNo() + ")");
            System.out.println("Average: " + t.getAverage());
            t=t.getLink();
        }
        System.out.println();
    }

    public void sort()
    {
        int n=countNodes();
        int i=1;
        while(i<n)
        {
            Node ptr=start;
            for(int j=0; j<n-1; ptr=ptr.getLink())
            {
                if(ptr.getAverage()<ptr.getLink().getAverage())
                {
                    double t1=ptr.getAverage();
                    ptr.setAverage(ptr.getLink().getAverage());
                    ptr.getLink().setAverage(t1);
                    
                    String t2=ptr.getName();
                    ptr.setName(ptr.getLink().getName());
                    ptr.getLink().setName(t2);
                    
                    int t3=ptr.getRollNo();
                    ptr.setRollNo(ptr.getLink().getRollNo());
                    ptr.getLink().setRollNo(t3);
                }
                j++;
            }
            i++;
        }        
    }
}

public class Linked_List_Sorting
{
    public static void main(String args[])
    {
        LinkedListOperations llo=new LinkedListOperations();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students whose details you want to enter: ");
        int n=sc.nextInt();
        System.out.println("Enter details of " + n + " students:");
        for(int i=1; i<=n; i++)
        {
            System.out.println("\nStudent #" + i + ":");
            System.out.print("Name: ");
            String name=sc.next();
            System.out.print("Roll number: ");
            int roll=sc.nextInt();
            System.out.print("Average marks: ");
            double avg=sc.nextDouble();
            llo.insert(name, avg, roll);
        }
        llo.displayAll();
        llo.sort();
        System.out.println("\nStudent (in order of their ranks): ");
        llo.displayLimit(n);
        System.out.println("\nTop three rank holders: ");
        llo.displayLimit(3);
    }
}
