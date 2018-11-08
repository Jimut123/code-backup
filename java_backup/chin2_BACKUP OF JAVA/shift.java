import java.io.*;
public class shift
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER ::");
        int a = Integer.parseInt(br.readLine());
        int b = a >>> 2;
        System.out.println(b);
    }
}
