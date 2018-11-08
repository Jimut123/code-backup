import java.util.*;
public class one_compliment
{
    String a;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter binary number");
        a=sc.nextLine();
        convert();
    }
    void convert()
    {
        int b;
        String c="";
        for(b=0;b<a.length();b++)
        {
            if(a.charAt(b)=='0')
            {
                c=c+1;
            }
            else if(a.charAt(b)=='1')
            {
                c=c+0;
            }
        }
        System.out.println(c);
    }
}
                