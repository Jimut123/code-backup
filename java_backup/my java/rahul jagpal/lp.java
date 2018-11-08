import java.io.*;
class lp
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int n,i;
        System.out.println("Enter a number :");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.println(i);
        }
    }
}
        