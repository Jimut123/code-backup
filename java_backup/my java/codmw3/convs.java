import java.util.*;
public class convs
{
    Scanner sc=new Scanner(System.in);
    String a;
    void input()
    {
        System.out.println("Enter the numebr");
        a=sc.nextLine();
    }
    int conv(int m)
    {
        if(m==0)
        {
            return Integer.parseInt(""+a.charAt(m))*(int)Math.pow(2,a.length()-1-m);
        }
        else
        {
            return Integer.parseInt(""+a.charAt(m))*(int)Math.pow(2,a.length()-1-m)+conv(m-1);
        }
    }
    void main()
    {
        input();
        System.out.println(+conv(a.length()-1));
    }
}
 