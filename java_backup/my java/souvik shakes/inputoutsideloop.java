import java.io.*;
class inputoutsideloop
{
    public static void main(String args[])throws IOException
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    int i,n;
    System.out.println("Enter the number");
    n=Integer.parseInt(br.readLine());
    for(i=2;i<=n;i=i+2)
    {
        System.out.println(i);
    }
}
}
    