import java.io.*;
class cr
{
    public static void main ()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int i,f=0,j;
        for(i=1;i<=100;i++)
        {
            f=0;
            for(j=2;j<i;j++)
            if(i%j==0)
            {
                f=1;
                break;
            }
            if(f==0)
            System.out.println(i);
        }
    }
}