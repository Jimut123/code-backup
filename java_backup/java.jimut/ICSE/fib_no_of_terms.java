import java.io.*;
class fib_no_of_terms
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,c=0,a=0,b=1,count=2;
        System.out.println("Enter the last number of your series::");
        n = Integer.parseInt(cd.readLine());
        System.out.print(a+","+b);
        do
        {
            c=a+b;
            System.out.print(","+c);
            a=b;
            b=c;
            count++;
        }
        while(count<n);
    }
}