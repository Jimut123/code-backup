import java.util.*;
public class number2 extends bin2 implements oct2  
{
    Scanner sc=new Scanner(System.in);
    int num;
    void input()
    {
        System.out.println("Enter number");
        num=sc.nextInt();
        cal(num);
        cal2(num);
        cal3(num);
    }
    public void cal2(int a)
    {
        int c;
        String b="",d="";
        while(a!=0)
        {
            b+=a%8;
            a=a/8;
        }
        for(c=b.length()-1;c>=0;c--)
        {
            d+=b.charAt(c);
        }
        System.out.println(d);
    
    }
    void display()
    {
        System.out.println(+num);
    }
}