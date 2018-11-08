
import java.io.*;
public class CIRCULAR
{

   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int n;
  int n1;int i,c,k,k1,k2;
 
   
  void input()throws IOException
  {
      n=Integer.parseInt(br.readLine());
      n1=n;
      c=0;
      while(n1>0)
      {
          c++;
          n1=n1/10;
        }
        k1=fact_sum(n);
        i=1;
        k=0;
        while(i<=c)
        {
            k=(k*10)+9;
            i++;
        }
        k2=(int)Math.pow(10,(c-1));
        
        
        for(i=k2;i<=k;i++)
        {
            if(k1==fact_sum(i))
            {
                if(primecheck(i)==1)
                  System.out.println(i);
                }
            }
        }
        int fact_sum(int n)
        {
            int n1,f,k,j,s;
            n1=n;
            s=0;
            while(n1>0)
            {
                k=n1%10;
                if(k!=0)
                {
                 f=1;
                for(j=1;j<=k;j++)
                f=f*j;
            
                s=s+f;
            }
                n1=n1/10;
            }
            return s;
        }
        int primecheck(int i)
        {
            int j,f;
            f=0;
            for(j=2;j<i;j++)
             if(i%j==0)
             {
                 f=1;
                 break;
                }
                if(f==0)
                 return 1;
                 else
                 return 0;
                
                
                }
        
    public static void main(String args[])throws IOException
    {CIRCULAR ob=new CIRCULAR();
       ob.input();
    }

}   