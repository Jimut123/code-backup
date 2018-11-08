import java.io.*;
class unique_digit
{
    public static void main()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        int m,n
        System.out.print("Enter lower limit : ");
        m=Integer.parseInt(br.readLine());
        System.out.print("Enter upper limit : ");
        n=Integer.parseInt(br.readLine());
        if(m>n)
        {
            System.out.print("*****ERROR******");
            System.out.print("Enter lower limit : ");
            m=Integer.parseInt(br.readLine());
            System.out.print("Enter upper limit : ");
            n=Integer.parseInt(br.readLine());
        }
        else
        {
            for(i=m;i<n;m++)
            {
                a=m%10;
                b=m/10;