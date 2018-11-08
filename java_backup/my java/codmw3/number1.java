import java.util.*;
public class number1
{
    Scanner sc=new Scanner(System.in);
    int a;
    void input()
    {
        System.out.println("Enter number");
        a=sc.nextInt();
    }
    void rev()
    {
        int b,c,st1,st2,st3;
        b=a;
        c=0;
        while(b>0)
        {
            c++;
            b=b/10;
        }
        st1=a/(int)(Math.pow(10,c/2));
        st2=a%(int)(Math.pow(10,c/2));
        st3=(st2*(int)Math.pow(10,c/2))+st1;
        System.out.println(+st3);
    }
}