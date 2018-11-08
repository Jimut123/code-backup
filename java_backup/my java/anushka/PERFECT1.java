
import java.io.*;
public class PERFECT1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k1;k1=Integer.parseInt(br.readLine());
        PERFECT ob=new PERFECT(k1);
        ob.perfectsq();
        ob.sumof();
    }
}