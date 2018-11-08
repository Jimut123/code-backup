import java.util.*;
public class smith
{
    int sum1(int a)
    {
        int s=0;
        while(a>0)
        {
            s+=a%10;
            a=a/10;
        }
        return s;
    }
    void start()
    {
        int num,v=0,s1=0,s2=0,c=2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        num=sc.nextInt();
        s1=sum1(num);
        v=num;
        while(c<=num)
        {
            if(v%c==0)
            {
                s2=s2+sum1(c);
                v=v/c;
            }
            else
            {
                c=c+1;
            }
        }
        if(s1==s2)
        {
            System.out.println("Smith number");
        }
        else
        {
            System.out.println("Not a Smith number");
        }
    }
}