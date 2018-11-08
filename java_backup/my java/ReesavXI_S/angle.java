import java.util.*;
class angle
{
    int m,d;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Degree");
        d=sc.nextInt();
        System.out.print("Enter Minutes");
        m=sc.nextInt();
    }
    void display()
    {
        System.out.println("Angle = "+d+":"+m);
    }
    angle sum(angle b)
    {
        angle sum=new angle();
        sum.m=(this.m+b.m)%60;
        sum.d=this.d+b.d+((this.m+b.m)/60);
        return sum;
    }
}