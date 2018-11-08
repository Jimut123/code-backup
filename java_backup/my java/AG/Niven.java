import java.util.*;
class Niven
{
    public static void main()
    {
        int n,n1,c,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        n=sc.nextInt();                                                                                                          
        n1=n;
        c=0;
        while(n1>0)
        {
            k=n1%10;
            c=c+k;
            n1=n1/10;
        }
        if(n%c==0)
        System.out.println("Niven no.");
        else
        System.out.println("Not Niven no.");
    }
}