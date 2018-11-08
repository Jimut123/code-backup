import java.io.*;
class number
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int s,a,n,n1;
        System.out.println("Enter a no");
        n=Integer.parseInt(br.readLine());
        s=0;
        n1=n;
        while(n1>0)
        {
            k=n1%10;
            f=1;
            for(d=1;d<=k;d++);
            f=f*d;
            s=s+f;
            n1=n1%10;
        }
        if(s==n);
        System.out.println("Krishnamurti no");
        ifelse
        System.out.println("Non-Krishnamurti no");
    }
}
            
            
            
            
            