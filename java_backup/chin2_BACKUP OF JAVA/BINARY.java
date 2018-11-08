import java.io.*;
public class BINARY
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER ::");
        int a = Integer.parseInt(br.readLine());
        double asci = 0,count = 0;
        for(int i = a; i != 0 ; i = i/2)
        {
            asci = i%2*Math.pow(10,count)+asci;
            count++;
        }
        System.out.println("Binary Value of "+a+" is = ("+(long)asci+")^2");
    }
}
