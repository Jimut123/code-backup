import java.io.*;
class Sum
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,s,k;
        System.out.println("Enter a no");
        a=Integer.parseInt(br.readLine());
        s=0;
        while(a>0)
        {
            k=a%10;
            s=s+k;
            a=a%10;
        }
        }
       System.out.print("sum is"+s)
    }
