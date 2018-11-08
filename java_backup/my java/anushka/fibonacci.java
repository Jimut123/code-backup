
import java.io.*;
public class fibonacci
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,a,b,c,f,j;
        a=0;b=1;
        if(a>=100&&a<=10000)
        {System.out.println(a);
        }
        if(b>=100&&b<=10000)
        {System.out.println(b);
        }
        for(i=1;i<=10000-2;i++)
        {
            c=a+b;
            if(c>=100&&c<=10000)
            {f=0;
                for(j=2;j<c;j++)
                {if(c%j==0)
                    {f=1;
                        break;
                    }
                }
                if(f==0)
                {System.out.println(c);
                }
                
            }
            a=b;b=c;
        }
    }
}