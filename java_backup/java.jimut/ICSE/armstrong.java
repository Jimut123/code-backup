import java.io.*;
class armstrong
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s=0,k,n1;
        System.out.println("Enter a number to check whether it is a armstong number or not::");
        n = Integer.parseInt(cd.readLine());
        n1=n;
        while(n!=0)
        {
            k=n%10;
            s=s+(k*k*k);
            n=n/10;
        }
        if(n1==s)
        {
            System.out.println("Your number's is a armstong number: and its armstong is:"+s);
        }
        else
        {
            System.out.println("Your number's is not a armstong number: and its armstong is:"+s);
        }
    }
}