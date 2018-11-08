import java.util.*;
public class object
{
    String s;
    void input()
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter sentence");
    s=sc.nextLine();
   }
   void check(object ob)
   {
       System.out.println(+(ob.s).length());
       System.out.println(+(this.s).length());
   }
   void main()
   {
       object ob1=new object();
       object ob2=new object();
       ob1.input();
       ob2.input();
       ob1.check(ob2);
    }
}