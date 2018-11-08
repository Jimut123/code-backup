import java.io.*;
class sides
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,b,c;
        System.out.println("Enter data");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        if(a==a&&a==c&&b==c)
        System.out.println("Equilateral triangle");
        else
        if(a==b||a==c|b==c)
        System.out.println("Isoceles triangle");
        else
        System.out.println("Scelene triangle");
    }
}