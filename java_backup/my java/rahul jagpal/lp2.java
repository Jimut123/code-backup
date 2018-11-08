import java.io.*;
class lp2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int i,n,f=1;
        System.out.println("Enter a number :");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}