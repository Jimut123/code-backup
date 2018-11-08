import java.io.*;
public class reverse
{
    public static void main(String args[])throws IOException
    {
        int n,k,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt (br.readLine ());
        s=0;
        while(n>0)
        {
            k=n%10;
            s=(s*10)+k;
            n=n/10;
        }
        System.out.println(s);
    }
}