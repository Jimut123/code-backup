//to input a positive range and display all the pall prime number within it.
import java.util.*;
class pallprime
{
    public static void main()
    {
    int k,s,n,n1,f;
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
     s=0;
     n1=n;
    while(n1>0)
    {
        k=n1%10;
        s=(s*10)+k;
        n1=n1/10;
    }
        if(s==n)
        {
            f=0;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println("Prime");
        System.out.println("Pallandrome");
    }
}
    else
    System.out.println("non prime Pallandrome");
    }
}