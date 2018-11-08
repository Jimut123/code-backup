import java.util.*;
public class ndaycal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day");
        int d=sc.nextInt();
        System.out.println("enter month");
        int m=sc.nextInt();
        System.out.println("enter year");
        int y=sc.nextInt();
        System.out.println("enter no of days");
        int nd=sc.nextInt();
        int ny=nd/365;
        int m1=nd%365;
        int nm=m1/30;
        int m2=m1%30;
        System.out.println(m2+"/"+(m+nm)+"/"+(y+ny));
    }
}
        