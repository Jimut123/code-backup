import java.io.*;
class oodd
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a;
        System.out.println("Enter data");
        a=Integer.parseInt(br.readLine());
        if(a%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
    }
}