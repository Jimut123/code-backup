import java.io.*;
class sum
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n;
        System.out.println("Enter a number:");
        n = Integer.parseInt(cd.readLine());
        int c=0,d,s=1,s1=0;
        while(n!=0)
        {
            c++;
            d=n%10;
            if(c%2!=0)
            s=s*d;
            else
            s1=s1+d;
            n=n/10;
        }
        System.out.println("Product:"+s);
        System.out.println("Sum:"+s1);
    }
}