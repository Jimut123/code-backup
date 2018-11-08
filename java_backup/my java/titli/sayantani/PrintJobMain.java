package sayantani;

import java.util.*;
class PrintJobMain
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println(“Enter capacity”);
         PrintJob obj=new PrintJob(sc.nextInt());
    }
}

				  						        	   
import java.util.*;
class PrintJob
{
    private int job[];				
    private int NewJob;			
    private int cap;				
    private int front;
    private int rear;
    public PrintJob(int c)
    {
        cap=c;
        front=-1;   rear=-1;
        createJob();
    }
    public void createJob()
    {
        Scanner sc=new Scanner(System.in);
        job=new int [cap];
        int c=0;
        do{
            System.out.println("Enter 1 to add, 2 to remove and 3 to exit");
            c=sc.nextInt();
            switch(c)
            {
                case 1 : System.out.println("Enter new job");
                         NewJob=sc.nextInt();
                         addJob();  break;
                case 2 : removeJob();  break;
                case 3 : break;
                default : System.out.println("Invalid input");
            }
        }while(c!=3);
    }
    public void addJob()
    {
        if(front==0&&rear==cap-1)
        {
            System.out.println("Printjob is full. Cannot add anymore");
            return;
        }
        else if(rear==cap-1)
        {
            int k=0;
            for(;front<cap;)
               job[k++]=job[front++];          
            rear=k; front=0;
        }
        job[++rear]=NewJob;
        front=(rear==0)?    0 : front;
    }
    public void removeJob()
    {
        if(front>rear||front==-1)
        {
            front=-1;   rear=-1;
            System.out.println("Printjob is empty.");
            return;
        }
        System.out.println("Removed "+job[front++]);
    }
}
