import java.io.*;
class QUEUE
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int f,r,i,k; int a[][],q[];int n;int b[][];
    QUEUE()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        f=-1;
        r=-1;
        System.out.println("Enter the limit of ur array");
        n=Integer.parseInt(in.readLine());
        int a[][]=new int[n][n];int b[][]=new int[n][n];
        q=new int[100];
    }
    void insert()throws IOException
    {
        k=Integer.parseInt(in.readLine());
        if(r>=100)
        {
            System.out.println("Queue overflows");
            return;
        }
        else
        if(f<0)
        {
            q[++f]=k;
            r++;
        }
        else
        {
            q[++r]=k;
        }
    }
    int p=0;int q1=0;
    void del()
    {
        System.out.println("Deleted element from queue=  "+q[f]);
        
        a[p][q1]=q[f];
        q1++;
        if(q1==n)
        {
            p++;
            q1=0;
        }
        f++;
    }
    void disp()
    {
        for(i=f;i<r;i++)
        System.out.println(q[i]);
    }
    public  void main()throws IOException
    {
        int x;
        do
        {
            System.out.println("Press 1 for insertion");
            System.out.println("Press 2 for deletion");
            System.out.println("Press 3 for reinstalltion");
            System.out.println("Press 4 for display");
            System.out.println("Enter your choice");
            x=Integer.parseInt(in.readLine());
            switch(x)
            {
                case 1: insert();
                         break;
                case 2: del();
                         break;
                case 3: a[0][0]=q[++r];int c=0;int d;
                        for(i=0;i<n;i++)
                        {
                            d=0;
                        for(int j=0;j<n;j++)
                        {
                            if(a[i][j]!=0)
                            {
                                a[i][j]=b[c][d];
                                d++;
                            }
                            //c++;
                        }
                        c++;
                    }
                    break;
                case 4: disp();
                        break;
                        
                default: System.exit(0);
            }
        }
        while(true);
    }
}
    
    
    
    
    
    