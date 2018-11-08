//unique digit no.
import java.io.*;
class UniqueDigit
{
   int m,n;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void check()throws IOException
   {
       int i;
       System.out.println("enter lower limit");
        m=Integer.parseInt(br.readLine());
       System.out.println("enter upper limit");
        n=Integer.parseInt(br.readLine());
       for(i=m;i<=n;i++)
       {
           boolean b=unique(i);
           if (b==true)
            System.out.println(i);
        }
    }
    public boolean unique(int n)
    {
        int n1=n,d,c=0,i=0,f=0;
        while(n1>0)
        {
            d=n1%10;
            c=c+1;
            n1=n1/10;
        }
        int a[]=new int[c];
        n1=n;
        while(n1>0)
        {
            d=n1%10;
            a[i++]=d;
            n1=n1/10;
        }
        n1=n;
        while(n1>0)
        {
            d=n1%10;
            for(i=0;i<c;i++)
            {
                if (a[i]==d)
                 f=f+1;
                }
                if (f>1)
                 return false;
                f=0;
                n1=n1/10;
            }
            return true;
        }
    }
