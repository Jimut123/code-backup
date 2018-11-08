
import java.io.*;
public class PERFECT
{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n;int c,i,k,s,j;
     PERFECT()throws IOException
     {
        
        }
        PERFECT(int n1)
        {
            n=n1;
        }
        void perfectsq()
        {
            c=0;
            for(i=n;;i++)
            {
                k=(int)Math.sqrt(i);
                if((k*k)==i)
                {System.out.println(i);
                    c++;
                }
                if(c>=5)
                {
                    break;
                }
            }
        }
        void sumof()
        {
            for(i=1;i<=n;i++)
            {
                s=0;
                for(j=i;j<=n;j++)
                {
                    s=s+j;
                    if(s==n)
                    {
                        for(k=i;k<=j;k++)
                        {
                            System.out.print(k+" ");
                           
                        }
                        
                        System.out.println("");
                         break;
                    }
                        else
                        {
                            if(s>n)
                            {break;
                            }
                        }
                    }
                }
            }
        }