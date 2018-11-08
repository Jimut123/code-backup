//Smith no.
import java.io.*;
class Smith
{
   int n;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void check()throws IOException
   {
       System.out.println("enter a no.");
        n=Integer.parseInt(br.readLine());
       int s=sum(n);
       int f=fact();
       if (s==f)
        System.out.println("it is a Smith Number");
       else
        System.out.println("not a Smith Number");
    }
    public int sum(int n)
    {
        int n1=n,s=0;
        while(n1>0)
        {
            int d=n1%10;
            s=s+d;
            n1=n1/10;
        }
        return s;
    }
    public int fact()
    {
        int n1=n,i,f=0,s1=0;
        while(n1>1)
        {
            for(i=2;i<=n1;i++)
            {
                if (n1%i==0)
                {
                    f=i;
                    break;
                }
            }
            if (f>9)
             f=sum(f);
            s1=s1+f;
            n1=n1/i;
        }
        return s1;
    }
}
