import java.io.*;
class dimension
{
    public static void main(String args[])throws IOException
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int a,p,l,b;
    l=Integer.parseInt(br.readLine());
    b=Integer.parseInt(br.readLine());
    a = l * b;
    p = 2*(l * b);
    System.out.println(a);
    System.out.println(p);
}
}    