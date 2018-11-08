import java.io.*;
class que
{
    int f1,r1,f2,r2,a[][],b[],q[];int i;int j;int c=0;int k;int t,p;
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    que()
    {
        f1=-1;f2=-1;
        r1=-1;r2=-1;
        q=new int[10];
        b=new int[5];
        a=new int[3][3];
        
    }
    void insert()throws IOException
    {
        k=Integer.parseInt(in.readLine());
        if(r1>=10)
        {
            System.out.println("queue overflows");
            return;
        }
        else
        if(f1<0)
        {
            q[++f1]=k;
            r1++;
        }
        else
        {
            q[++r1]=k;
        }
    }
        void del()
        {
            System.out.println("deleted elements from queue="+q[f1]);
            c++;
            if(c<3)
            {
                for(i=0;i<3;i++)
                for(j=0;j<3;j++)
                a[i][j]=f1;
            }
            else
            {
                r1=0;f1=0;
                for(i=0;i<3;i++)
                {
                    for(j=0;j<3;j++)
                    {
                        if(f2>5)
                        {
                            f2=-1;r2=-1;
                        }
                        t=a[i][j];
                        if(r1>=10)
                        return;
                        p=q[r1++];
                        //if(r1>10)
                        //return;
                        q[r1]=t;
                        if(f2<0)
                        {
                            b[++f2]=p;
                            r2++;
                        }
                        else
                        b[++r2]=p;
                    }
                }
            }
            f1++;
        }
        void disp()
        {
            for(i=f1;i<=r1;i++)
            {
                System.out.println(q[i]);
            }
        }
        public void main()throws IOException
        {
            int x;
            do
            {
                System.out.println("press 1 for insert");
                System.out.println("press 2 for delete");
                System.out.println("press 3 for display");
                System.out.println("Enter your choice");
                //System.out.println("press 1 for insert");
                x=Integer.parseInt(in.readLine());
                switch(x)
                {
                    case 1:insert();
                             break;
                    case 2:del();
                             break;
                    case 3:disp();
                              break;
                    case 5:System.exit(0);
                }
            }while(true);
        }
    }
    

    
