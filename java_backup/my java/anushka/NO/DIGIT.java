package NO;
import java.io.*;
public class DIGIT
{   int n;int s;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public void Input()throws IOException
    {
        n=Integer.parseInt(br.readLine());
        System.out.println(Digits(n));
    }
    public int Digits(int a)
    {   s=0;
        while(n>0)
        {
            a=n%10;
            if(a%2==0)
            {s=s+a;
            }
            n=n/10;
        }
        return s;
    }
}

