
import java.io.*;
public class happyno
{
   
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n;
       System.out.println("enter the upper limit ");
       n=Integer.parseInt(br.readLine());
       for(int i=1;i<=n;i++)
       {
           int k=i;
           int s=0;
           while (k>0)
           {
               s=s+((k%10)*(k%10));
               k=k/10;
            }
            int r=digit(s);
            if (r==1)
            System.out.println(i);
        }
    }
    public static int digit(int p)
    {
        int m=0;
         //System.out.println("Again"+p);
        while (p>0)
        {
            m=m+p%10;
            p=p/10;
        }
        if(m>=10)
        {
            //System.out.println(m);
       return digit(m);
    }
    else
       return m;
        
    }
}
