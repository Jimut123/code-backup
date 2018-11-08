
import java.io.*;
public class ascending1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter term:");
        n=Integer.parseInt(br.readLine());
        ascending a=new ascending(n);
        System.out.println("Enter term:");
         n=Integer.parseInt(br.readLine());
        ascending b=new ascending (n);
        a.displayList();
        b.displayList();
        ascending c=new ascending (n);
        c=a.merge(b);
    }
}