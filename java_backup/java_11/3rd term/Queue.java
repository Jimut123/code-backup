import java.io.*;
class Queue
{
    int a[]=new int[50];
    int front;
    int rear;
    Queue()
    {
        front=0;
        rear=0;
    }
    void push(int d)
    {
        if(rear==49)
        System.out.println("Queue overflow.");
        else 
        {
            a[rear]=d;
            rear++;
        }
    }
    void pop()
    {
        if(rear==0)
        System.out.println("Stack empty.");
        else
        front++;
    }
    void display()
    {
        if(rear==0)
        System.out.println("Stack empty");
        else
        {
            for(int i=front;i<rear;i++)
            
        System.out.print(a[i]+"---->");

        }
        
        System.out.println();
    }
    

}