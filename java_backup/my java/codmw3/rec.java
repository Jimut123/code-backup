import java.util.*;
public class rec
{
    int a;int b;int j=1;
    void input()
    {
        Scanner sc=new Scanner(System.in);        
        int c=0;
        System.out.println("Enter number 1");
        a=sc.nextInt();
        System.out.println("Enter number 2");
        b=sc.nextInt();
        c=a;
        pow(a,b,c);
        System.out.println(+j);        
    }
    void pow(int e,int d,int g)
    {
        j=e*j;
        d--;
        if(d==0)
        {
            return;
        }
        else 
        {
            pow(e,d,g);
        }
    }
}
        
        