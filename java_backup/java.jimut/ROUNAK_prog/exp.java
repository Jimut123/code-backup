import java.io.*;
import java.math.*;
class exp
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd  = new BufferedReader(ab);
        System.out.println("Enter two values:");
        double a = Double.parseDouble(cd.readLine());
        double b = Double.parseDouble(cd.readLine());
        double c = Math.pow(a,b);
        System.out.println("The exponential value:"+c);
    }
}
