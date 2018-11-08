import java.io.*;
class fib_last_digit
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,c=0,a=0,b=1,i;
        System.out.println("Enter the last number of your series::");
        n = Integer.parseInt(cd.readLine());
        System.out.print(a+","+b);
        do
        {
            c=a+b;
            if(c<=n)
            {
             System.out.print(","+c);
            }
           
            a=b;
            b=c;
          }
        while(c<n);
    }
}