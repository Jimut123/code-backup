import java.util.*;
public class banks
{
    static int c,inv;
    static String na;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        na=sc.nextLine();
        System.out.println("Enter code");
        c=sc.nextInt();
        System.out.println("Enter investment");
        inv=sc.nextInt();
        
    }
    void display()
    {
        System.out.println(+c);
        System.out.println(+inv);
        System.out.println(na);
    }
}