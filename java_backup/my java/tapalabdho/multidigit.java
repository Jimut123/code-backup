//to input any multidigit number and display the multirelation digit upto 10 digits.
import java.util.*;
class multidigit
{
    public static void main()
    {
        int n,k,s,i;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        {
            while(n>0)
            {
                k=n%10;
                s=1;
                for(i=1;i<=10;i++)
                {
                    s=k*i;
                    if(s<10)
                    System.out.println(s);
                }
                n=n/10;
            }
        }
    }
}
