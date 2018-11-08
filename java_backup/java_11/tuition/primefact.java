import java.io.*;
class primefact
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,i;
        System.out.println("Enter a number");
        n = Integer.parseInt(cd.readLine());
        i=2;
        while(i<=n)
        {
            if(n%i==0)
            {
                n=n/i;
                System.out.println(i);
                continue;
             }
            else
            {
                i++;
            }
        }
}
}