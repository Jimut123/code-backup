
import java.io.*;
class month
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,i,s,n=0;
        a=Integer.parseInt(br.readLine());
        a=n;
        s=0;
        while(a>0)
        {
            s=(s*10)+a%10;
            a=a/10;
        }
        if(s==n)
        System.out.println("Palindrome no");
        else
        System.out.println("Non-Palindrome no");
    }
}