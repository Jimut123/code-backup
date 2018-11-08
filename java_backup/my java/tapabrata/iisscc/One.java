package iisscc;
import java.io.*;
    class One
    {
        int front,rear,limit;
        int arr[];
        public One(int lim)
        {
            limit=lim;
            front=rear=-1;
            arr=new int[limit];
        }
        public void insert(int d)
        {
            if(rear==-1)
            {
                front=rear=0;
                arr[rear]=d;
            }
            else if(rear==limit-1)
                System.out.println("queue overflow");
            else
                arr[++rear]=d;
        }
        public void delete()
        {
             if(rear==-1)
                 System.out.println("queue underflow");
             else if(front==rear)
                 front=rear=-1;
             else
                 ++front;
        }
        public void display(int n)
        {
            if(rear==-1)
            {
                System.out.println("queue is empty");
                return;
            }
            else if(n<=rear)
            {
                System.out.print(arr[n]+" ");
                display(++n);
            }
            else
               return;
        }     
        public void main(int n)throws IOException
        {
            int ans;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            if(n==1)
            {
                System.out.println("1. insert");
                System.out.println("2. delete");
                System.out.println("3.display");
                System.out.print("enter your choice :");
                int ch=Integer.parseInt(br.readLine());
                switch(ch)
                {
                    case 1: System.out.print("enter value :");
                            int n2=Integer.parseInt(br.readLine());
                            insert(n2);
                            break;
                    case 2: delete();
                            break;
                    case 3: display(front);
                            break;
                    default:System.out.println("wrong input");
                            break;
                }
                System.out.println("more(1/0)");
                ans=Integer.parseInt(br.readLine());
                main(ans);
            }
            else
                return;
        }   
        public static void main(String ar[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the limit");
            int c=Integer.parseInt(br.readLine());
            One ob=new One(c);
            ob.main(1);
        }
}