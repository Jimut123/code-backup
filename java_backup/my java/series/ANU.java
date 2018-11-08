
import java.io.*;
public class ANU
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j;double s; s=0;int a,n;
        j=1;
        n=Integer.parseInt(br.readLine());
        a=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i=i+2)
        {
            
                s=s+(Math.pow(j,j+1)/Math.pow(a+j,j+1));
           
        }
        System.out.println("THE SERIES:"+s);
    }
}
