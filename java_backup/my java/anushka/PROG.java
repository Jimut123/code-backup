
import java.io.*;
public class PROG
{
    public static void main(String args[])throws IOException
    {  int y;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        RANGE R=new RANGE();
        y=Integer.parseInt(br.readLine());
        R.T.Input(y);
        R.display();
    }
}