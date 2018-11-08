import java.io.*;
class series
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    void series()throws IOException
    {   int n;
        System.out.println("Enter n");
        n=Integer.parseInt(in.readLine());
        gen(n);
    }
    void gen(int n)
    {
        int s=0,j=1,k=1;
        for(int i=1;i<=n;i++)
        {
            s=s+((pow(j)/fact(j))*k);
            j=j+2;
            k=k*-1;
        }
        System.out.println(s);
    }
    int fact(int i)
    {
        int f=1;
        {
            for(int k=i;k>=1;k--)
            {
                 f=f*k;
            }
            return f;
        }
    }
    int pow(int i)
    {
        int p=(int)Math.pow(i,i);
        return p;
    }
    public static void main()throws IOException
    {
        series s=new series();
        
    }
}
     