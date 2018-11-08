import java.util.*;
public class date2
{
    int y,m,d;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter year");
        y=sc.nextInt();
        System.out.println("Enter month");
        m=sc.nextInt();
        System.out.println("Enter day");
        d=sc.nextInt();
    }
    void display()
    {
        System.out.println("The date is:"+d+":"+m+":"+y);
    }
}
    
        