import java.io.*;
class out2
{
    public static void main () throws IOException
    {
        int s;
        
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter a number");
        s = 5;
        s = ++s+--s+s+++s--+s;
        System.out.println(s);
    }
}

        