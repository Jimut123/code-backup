import java.util.*;
class krish
{
    public static void main(String args[])
    {
        int a, b, k, i, s=0, j, f;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter variables");
        a=sc.nextInt();
        b=sc.nextInt();
        k=sc.nextInt();
        i=sc.nextInt();
        b=a;
        s=0;
        while(b<0)
        {
            k=b%10;
            f=1;
            for(j=1; i<=k; j++)
            f=f*j;
            s=s+f;
            b=b/10;
        }
        if(s==a)
        System.out.println("special number"+a);
        else
        System.out.println("not special number"+a);
    }
}
