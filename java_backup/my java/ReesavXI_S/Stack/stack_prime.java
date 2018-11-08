package Stack;
import java.io.*;
class stack_prime
{
    int a[]=new int[100];
    int top,r=0;
    stack_prime()
    {
        top=-1;
    }
    void input()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("D://prod.bin");
        DataOutputStream dout=new DataOutputStream(fout);
        int cr=0;
        for(int i=100;i>=2;i--)
        {
            cr=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                cr=cr+1;
            }
            if(cr==1)
            {
                dout.writeInt(i);
                a[++top]=i;
                r=r+1;
            }
        }
    }
    void print_stack()throws IOException
    {
        System.out.println("STACK OUTPUT ");
        for(int k=top;k>=0;k--)
        System.out.print(a[k]+" ");
    }
    void print()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileInputStream fin=new FileInputStream("D://prod.bin");
        DataInputStream din=new DataInputStream(fin);
        int dt=0;
        boolean eof=false;
        System.out.println("FILE OUTPUT ");
        while(!eof)
        {
            try
            {
                for(int j=0;j<=r;j++)
                {
                    dt=din.readInt();
                    System.out.print(dt+" ");
                }
            }
            catch(EOFException e)
            {
                eof=true;
            }
        }
    }
    void main()throws IOException
    {
        stack_prime stk=new stack_prime();
        stk.input();
        stk.print_stack();
        stk.print();
    }
}

                