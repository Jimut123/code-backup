import java.io.*;
class queue
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n,p=0,q[],q1=0,c=0,front,rear,k;int a[][];int temp[],i,j;
    
    queue()throws IOException
    {
        front=rear=-1;
        System.out.println("ENTER THE LENGTH OF THE QUEUE");
    n=Integer.parseInt(br.readLine());
    int front,rear,i,k;
     q=new int[n];
     temp=new int[5];
    a=new int[3][3];
    }
    void insert()throws IOException
    {
        k=Integer.parseInt(br.readLine());
        if(rear>=n)
        {
            return;
        }
        else
        {
            if(front<0)
            {
                q[++front]=k;
                rear++;
            }
            else
            q[++rear]=k;
        }
    }
        void del()
        {
            System.out.println("Deleted Element"+q[front]);
            a[p][q1]=q[front];
            p++;
            if(p>n)
            {
                p=0;q1++;
            }
            if(q1>n)
            {
                p=0;
                q1=0;
                temp[c++]=a[p][q1];
                if(c>5)
                {
                    c=0;temp[0]=0;
                    temp[c++]=a[p][q1];
                }
            }
                front++;
        }
        void disp()
        {
            for(i=front;i<=rear;i++)
            {
                System.out.println(q[i]);
            }
                System.out.println("The matrix is");
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        System.out.print(a[i][j]);
                    }
                    System.out.println();
                }
        }
        public void input()throws IOException
        {
            int x;
            do
            {
                System.out.println("press 1 for insert");
                System.out.println("press 2 for deletion");
                System.out.println("press 3 for display");
                System.out.println("press 4 for exit");
                x=Integer.parseInt(br.readLine());
                switch(x)
                {
                    case 1:insert();
                    break;
                    case 2:del();
                    break;
                    case 3:disp();
                    break;
                    case 4:
                    System.exit(0);
                }
            }while(true);
        }
    }