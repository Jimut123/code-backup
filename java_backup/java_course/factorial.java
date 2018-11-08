import java.io.*;
class factorial
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter a number:");
        int n = Integer.parseInt(cd.readLine());
        fact a = new fact(n);
        a.fact();
    }
}