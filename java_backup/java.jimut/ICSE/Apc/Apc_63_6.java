package Apc;
import java.io.*;
class Apc_63_6
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("Enter a number ::");
        int n = Integer.parseInt(cd.readLine());
        System.out.println("Enter the choice to check whether the number is prime[1] or automorphic[2] ::");
        int ch = Integer.parseInt(cd.readLine());
        int i,d=0,k=0,s,l,j;
        switch(ch)
        {
            case 1:
            {
                for(i=2;i<n;i++)
                {
                    if(n%i==0)
                    {
                        d=1;
                    }
                }
                if(d==0)
                {
                    System.out.println("The number is a prime number.");
                }
                else
                {
                     System.out.println("The number is not a prime number.");
                }
                break;
            }
            case 2:
            {
                j=n;
                while(n!=0)
                {
                    l=n%10;
                    k=k+1;
                    n=n/10;
                }
                s=(j*j)%(int)(Math.pow(10,k));
                if(j==s)
                {
                    System.out.println("It is an automorphic number.");
                }
                else
                {
                     System.out.println("It is not an automorphic number.");
                }
                break;
            }
            default: System.out.println("Wrong choice.");break;
        }
        
    }
}