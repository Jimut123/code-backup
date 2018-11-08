import java.io.*;
class series1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,s,n,j,a,f,k,k1;
        System.out.println("Enter n:");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter number:");
        a=Integer.parseInt(br.readLine());
        s=0;
        j=1;
        k1=1;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                f=1;
                for(k=1;k<=k1;k++)
                 f=f*a;
             
             s=s+f;
             k1=k1+1;
            }
            else
            {
                s=s+j;
                j=j+1;
            }
        }
        System.out.println("Sum:"+s);
    }
}
        
        