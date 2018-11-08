import java.io.*;
public class ZING
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("");
        int a = Integer.parseInt(br.readLine());
        if(0 == 0)
        {
            System.out.println("\f");
        }
        int b = Integer.parseInt(br.readLine());
        if(0 == 0)
        {
            System.out.println("\f");
        }
        int c = Integer.parseInt(br.readLine());
        if(0 == 0)
        {
            System.out.println("\f");
        }
        double x = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double y = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println(x);
        System.out.println(y);
    }
}
