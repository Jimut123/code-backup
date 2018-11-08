import java.io.*;
class slim
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter a number :");
        int n,a,b,i,c;
        n=Integer.parseInt(br.readLine());
        a=0;
        b=1;
        System.out.println(a+","+b);
        for(i=1;i<=n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
   