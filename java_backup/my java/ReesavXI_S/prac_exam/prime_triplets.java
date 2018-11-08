package prac_exam;
import java.util.*;
class prime_triplets
{
    int S;
    int L;
    prime_triplets()
    {
        S=0;
        L=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting limit ");
        S=sc.nextInt();
        System.out.print("Enter last limit ");
        L=sc.nextInt();
    }
    void calc()
    {
        System.out.println("The Prime Triplets are :- ");
        int cr=0;
        for(int i=S;i<=L;i++)
        {
            if(isPrime(i)==true)
            {
                if(isPrime(i+2)==true)
                {
                    if(isPrime(i+6)==true)
                    {
                        System.out.println(" "+i+" "+(i+2)+" "+(i+6));
                        cr=cr+1;
                    }
                }
                else if(isPrime(i+4)==true)
                {
                    if(isPrime(i+6)==true)
                    {
                        System.out.println(" "+i+" "+(i+4)+" "+(i+6));
                        cr=cr+1;
                    }
                }
            }
        }
        System.out.print("Total prime triplets are = "+cr);
    }
    boolean isPrime(int s)
    {
        int cr=0;
        for(int i=2;i<s;i++)
        {
            if(s%i==0)
            cr=cr+1;
        }
        if(cr==0)
        return true;
        return false;
    }
    void main()
    {
        accept();
        calc();
    }
}
