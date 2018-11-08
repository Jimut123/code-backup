import java.io.*;
public class triangle
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("ENTER THE LIMIT::");
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        char v = 'A';
        int x = (int)v;
        for(int a = 1;a<=n;a++)
        {
            for(int i = 1;i<=n-a;i++)
            {
                System.out.print(" ");
            }
            for(int ch= x;ch<=x+m;ch++)
            {
                System.out.print((char)ch);
            }
            for(int h =(x+m)-1 ;h>=x;h--)
            {
                System.out.print((char)h);
            }
            m++;
            System.out.println();
        }
    }
}