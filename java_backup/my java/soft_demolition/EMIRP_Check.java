//this class will check whether a number is EMIRP or not
import java.util.*;
class EMIRP
{
    private int n;
    private int rev;
    private int f;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        isEMIRP();
    }

    public void isEMIRP()
    {
        int copy=n;
        while(copy!=0)
        {
            rev = rev*10 + copy%10;
            copy/=10;
        }
        f=1;
        int r=isPrime(rev);
        f=1;
        int no=isPrime(n);        
        if(n>=2 && r==1 && no==1)          
            System.out.println("The number you entered is an EMIRP number");  
        else System.out.println("The number you entered is not an EMIRP number");
    }

    public int isPrime(int x)
    {       
        f++;
        if(f == x) return 1;
        else 
        {
            if(x%f == 0)
                return 0;
            else return isPrime(x);
        }        
    }
}

public class EMIRP_Check
{
    public static void main(String args[])
    {
        new EMIRP().get();
    }
}