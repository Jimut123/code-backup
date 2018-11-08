import java.io.*;
public class program21
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,b,c;
         System.out.println("Enter first no");
        System.out.println("Enter second no");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=a;
        a=b;
        b=c;
        System.out.println("a is="+c);
        System.out.println("b is="+a);
    }
}
