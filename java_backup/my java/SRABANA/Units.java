import java.util.*;
class Units
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int u;
        double c;
        System.out.println("Units consumed:");
        u=sc.nextInt();
        if(u<=75)
        c=0;
        else if(u<=150)
        c=0+(u-75)*0.5;
        else if(u<=225)
        c=0+75*0.5+(u-150)*1.0;
        else if(u<=300)
        c=0+75*0.5+150*1.0+(u-225)*2.8;
        else
        c=0+75*0.50+150*1.0+225*2.8+(u-300)*3.50;
        System.out.println("The charge is:" +c);
    }
}