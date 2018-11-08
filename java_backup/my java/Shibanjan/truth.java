import java.io.*;
class truth
{
    int a[],i,m,n;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    truth()
    {
        a=new int[100];
        for(i=0;i<100;i++)
        a[i]=0;
    }
    void start()throws IOException
    {
       System.out.println("Enter nos. of digits:");
       n=Integer.parseInt(br.readLine());
       m=(int)Math.pow(2,n);
       for(i=0;i<m;i++)
       {
           bin(i);
           System.out.println("");
        }
    }
    void bin(int i)
    {
        int t,k,k1;
        t=0;
        while(i>0)
        {
            k=i%2;
            a[t++]=k;
            i=i/2;
        }
        for(k1=n-1;k1>=0;k1--)
        System.out.print(a[k1]);
    }
}
            
        