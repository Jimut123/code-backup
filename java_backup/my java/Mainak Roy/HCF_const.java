import java.io.*;
public class HCF_const
{
    int a,b;
        HCF_const(int x,int y) throws IOException
        {
            a=x;
            b=y;
        }
        public int cal()
        {
            int hcf=0;
            int m=0;
            if(a>b)
            {
                m=b;
            }
            else
            {
                m=a;
            }
            for(int i=1;i<=m;i++)
                if(a%i==0 && b%i==0)
                {
                   hcf=i;
                }
            return hcf;    
        }
    }

            
        