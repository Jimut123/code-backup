import java.io.*;
class max
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,s,k;
        System.out.println("enter a no.");
        a=Integer.parseInt(br.readLine());
        s=0;
        while(a>0)
        {
            k=a%10;
            s=(s*10)+k;
            a=a/10;
        }
        System.out.println("The no is"+s);
    }
}