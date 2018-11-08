import java.util.*;
public class pat2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e;
        
        System.out.println("Enter number");
        a=sc.nextInt();
        d=a/2;
        e=0;
        for(b=1;b<=a/2;b++)
        {
            for(c=1;c<=d;c++)
            {
                System.out.print("*");
            }
            for(c=1;c<=e;c++)
            {
                System.out.print(" ");
            }
            e+=2;
           for(c=1;c<=d;c++)
            {
                System.out.print("*");
            }
            d--;
            System.out.println();
        }
        d=1;
        e-=4;
        for(b=1;b<=(a/2)-1;b++)
        {
            for(c=d;c>=0;c--)
            {
                System.out.print("*");
            }
            for(c=1;c<=e;c++)
            {
                System.out.print(" ");
            }
            e-=2;
           for(c=d;c>=0;c--)
            {
                System.out.print("*");
            }
            d++;
            System.out.println();
        }
        
        
    }
}