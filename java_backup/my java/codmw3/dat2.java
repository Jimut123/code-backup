import java.util.*;
public class dat2
{
    Scanner sc=new Scanner(System.in);
    int m,d,y;
    void input(int a,int b,int c)
    {
        d=a;
        m=b;
        y=c;
    }
    void cal(dat2 ob,int dy)
    {
        ob.d+=dy;
        int mn[]={31,28,31,30,31,30,31,31,30,31,30,31};
        while(ob.d>mn[ob.m])
        {
            ob.d-=mn[ob.m];
            m++;
            if(m>11)
            {
                m=1;
                y++;
            }
        }
        System.out.print(+ob.d+":"+ob.m+":"+ob.y);
    }
    void main()
    {
        int a,b,c,d;
           System.out.println("Enter day");
           a=sc.nextInt();
           System.out.println("Enter month");
           b=sc.nextInt();
           System.out.println("Enter year");
           c=sc.nextInt();
           System.out.println("Enter days to be increased");
           d=sc.nextInt();
           dat2 k=new dat2();
           k.input(a,b,c);
           k.cal(k,d);
    }
}