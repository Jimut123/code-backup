import java.util.*;
public class dates
{
    Scanner sc=new Scanner(System.in);
    int dd,mm,yy;
    dates(int x,int y,int z)
    {
        dd=x;
        mm=y;
        yy=z;
        
    }
    void check(dates ob,dates ob2)
    {
        if(ob.yy>ob2.yy)
        {
            System.out.print(+ob.dd+":");
            System.out.print(+ob.mm+":");
            System.out.print(+ob.yy+"is greater");
        }
        else if(ob.yy<ob2.yy)
        {
            System.out.print(+ob2.dd+":");
            System.out.print(+ob2.mm+":");
            System.out.print(+ob2.yy+"is greater");
        }
        else if(ob.yy==ob2.yy)
        {
            if(ob.mm>ob2.mm)
           {
            System.out.print(+ob.dd+":");
            System.out.print(+ob.mm+":");
            System.out.print(+ob.yy+"is greater");
           }
           else if(ob2.mm>ob.mm)
           {
            System.out.print(+ob2.dd+":");
            System.out.print(+ob2.mm+":");
            System.out.print(+ob2.yy+"is greater");
        }
        else if(ob.mm==ob2.mm)
        {
            if(ob.dd>ob2.dd)
            {
                System.out.print(+ob.dd+":");
            System.out.print(+ob.mm+":");
            System.out.print(+ob.yy+"is greater");
        }
        else if(ob2.dd>ob.dd)
        {
            System.out.print(+ob2.dd+":");
            System.out.print(+ob2.mm+":");
            System.out.print(+ob2.yy+"is greater");
        }
    }
}
}
void main()
{
    int y1,y2,m1,m2,d1,d2;
    System.out.println("Enter year");
    y1=sc.nextInt();
    System.out.println("Enter month");
    m1=sc.nextInt();
    System.out.println("Enter days");
    d1=sc.nextInt();
     System.out.println("Enter year");
    y2=sc.nextInt();
    System.out.println("Enter month");
    m2=sc.nextInt();
    System.out.println("Enter days");
    d2=sc.nextInt();
    dates ob=new dates(d1,m1,y1);
    dates ob2=new dates(d2,m2,y2);
    check(ob,ob2);
}
}

    
        
            