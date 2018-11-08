import java.util.*;
class date
{
    void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("date1 ddmmyyyy");
        int d1=sc.nextInt();
        System.out.println("date2 ddmmyyyy");
        int d2=sc.nextInt();
        int y1=d1%10000;
        d1=d1/10000;
        int y2=d2%10000;
        d2=d2/10000;
        int m1=d1%100;
        d1=d1/100;
        int m2=d2%100;
        d2=d2/100;
        if(y1<y2)
        {
            System.out.println(d1+"/"+m1+"/"+y1);
        }
        else if(y2<y1)
        {
            System.out.println(d2+"/"+m2+"/"+y2);
        }
        else
        {
            if(m1<m2)
            {
                System.out.println(d1+"/"+m1+"/"+y1);
            }
            else if(m2<m1)
            {
                System.out.println(d2+"/"+m2+"/"+y2);
            }
            else
            {
                if(d1<d2)
                {
                    System.out.println(d1+"/"+m1+"/"+y1);
                }
                else
                {
                    System.out.println(d2+"/"+m2+"/"+y2);
                }
            }
        }
    }
}