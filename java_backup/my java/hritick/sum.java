import java.io.*;
class sum
{
    public static void main( )throws  IOException
    {
        int a,b,c;
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader br= new BufferedReader (read);
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println(c);
    }
}
