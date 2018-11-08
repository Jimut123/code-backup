import java.util.*;
class RevPrime
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Reverse a prime no.");
        int a,f,s,i,k;
        f=0;
        a=sc.nextInt();
        for(i=2;i<a;i++)
        {
            if(a%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        {
            s=0;
            while(a>0)
            {
                k=a%10;
                s=(s*10)+k;
                a/=10;
            }
              System.out.println(s);
            }
        }
    }