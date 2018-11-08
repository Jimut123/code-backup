import java.io.*;
class swap
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int c,b,a;
        System.out.println("Enter data");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
        
    }
}
        