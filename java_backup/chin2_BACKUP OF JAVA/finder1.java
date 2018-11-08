import java.io.*;
public class finder1
{
    public long factorial(int a)
    {
        long fact = 1;
        for(int i = 1; i <= a; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String arga[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        finder1 abc = new finder1();
        System.out.println("ENTER THE VALUE OF x ::");
        int x = Integer.parseInt(br.readLine());
        System.out.println("ENTER THE VALUE OF n ::");
        int n = Integer.parseInt(br.readLine());
        double S = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            S = S + (Math.pow(x,i)/abc.factorial(i));
        }
        System.out.println("S = "+S);
    }
}
