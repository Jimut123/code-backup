import java.util.*;
class use_angle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        angle an=new angle();
        angle an1 =new angle();
        an.input();
        an.display();
        an1.input();
        an1.display();
        angle an2=new angle();
        an2=an.sum(an1);
        an2.display();
    }
}