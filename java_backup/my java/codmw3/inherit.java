import java.util.*;
public class inherit
{
    String a;
    int b,c;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name");
        a=sc.nextLine();
        System.out.println("Enter marks");
        b=sc.nextInt();
        System.out.println("Enter roll number");
        c=sc.nextInt();
    }
    void display()
    {
        System.out.println(a);
        System.out.println(+b);
        System.out.println(+c);
    }
}