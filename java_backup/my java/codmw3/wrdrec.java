import java.util.*;
public class wrdrec
{
    Scanner sc=new Scanner(System.in);
    String s;
    void input()
    {
        System.out.println("Enter sentence");
        s=sc.nextLine();
    }
    void print1(int a)
    {
        if(s.charAt(a)==' ')
        {
            return;
        }
        System.out.print(s.charAt(a));
        print1(a+1);
    }
    void print2(int a)
    {
        if(s.charAt(a)==' ')
        {
            return;
        }
        print2(a-1);
        System.out.print(s.charAt(a));
    }
    void main()
    {
        input();
        print1(0);
        System.out.println();
        print2(s.length()-1);
    }
}    