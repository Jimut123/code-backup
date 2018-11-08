//program to find the number of prime and palindrome numbers form a range
import java.io.*;
class Prime_Palindrome
{
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    private int up;
    private int low;
    public void getRange()throws IOException
    {
        System.out.println("enter the upper range");
        up=Integer.parseInt(br.readLine());
        System.out.println("enter the lower range");
        low=Integer.parseInt(br.readLine());
    }
    public void show()throws IOException
    {
        System.out.println("the prime and palindrome numbers are:");
        for (int i=low;i<=up;i++)
        {
            int primeFlag=isPrime(i);
            int palinFlag=isPalin(i);
            if (primeFlag==1 && palinFlag==1)
            System.out.println(i);
        }
    }
    public int isPrime(int no)
    {
        int c=0;
        for(int i=2;i<no;i++)
        {
            if(no % i==0)
            c=1;
        }
        if (c==1)
        return 0;
        else 
        return 1;
    }
    public int isPalin(int no)
    {
        int num=no;
        int dg=0;
        int numbr=0;
        while (no>0)
        {
            dg=no % 10;
            numbr=numbr * 10 + dg;
            no=(int)no/10;
        }
        if(numbr==num)
        return 1;
        else
        return 0;
    }
}//end of class
public class MainPrime_Palindrome
{
    public static void main(String args[])throws IOException
    {
        PrimePalindrome obj=new PrimePalindrome();
        obj.getRange();
        obj.show();
    }
}//end of main class