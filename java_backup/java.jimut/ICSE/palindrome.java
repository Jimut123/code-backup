import java.io.*;
class palindrome
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int n,s=0,k,n1;
        System.out.println("Enter a number to check whether it is a palindrome number or not::");
        n = Integer.parseInt(cd.readLine());
        n1=n;
        while(n!=0)
        {
            k=n%10;
            s=(s*10)+k;
            n=n/10;
        }
        if(n1==s)
        {
            System.out.println("Your number's is a palindrome number: and its palindrome is:"+s);
        }
        else
        {
            System.out.println("Your number's is not a palindrome number: and its palindrome is:"+s);
        }
    }
}