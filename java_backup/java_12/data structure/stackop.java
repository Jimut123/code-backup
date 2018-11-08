import java.io.*;
class stackop
{
    int s[]=new int[20];
    int sp,n;
    stackop(int nn)
    {
        for(int i=0;i<20;i++)
         s[i]=0;
         sp=-1;
         n=nn;
    }
    void pushdata(int item)
    {
        if(sp==(n-1))
        System.out.println("Stack overflow.");
        else
        {
            sp++;
            s[sp]=item;
        }
    }
    void popdata()
    {
        int v;
        if(sp==-1)
        System.out.println("Stack underflow.");
        else
        {
            v=s[sp];
            System.out.println("Popped out elements = "+v);
            sp--;
        }
    }
    void display()
    {
        if(sp==-1)
         System.out.println("Stack empty.");
         else
         {
              System.out.println("SP----> |"+s[sp]+"|"); 
              System.out.println("         __");
              for(int i=sp-1;i>=0;i--)
              {
                   System.out.println("     |"+s[i]+"|");
                   System.out.println("      __");
                }
            }
    }
}






















