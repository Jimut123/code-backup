import java.util.*;
public class dateprint2
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String a;
        int c,d=0,dy,k,i,e,g;
        System.out.println("Enter the day");
        a=sc.nextLine();
        
        String b[]={"Sunday","Monday","Tuseday","Wednesday","Thursday","Friday","Saturday"};
        for(c=0;c<7;c=c+1)
        {
            if(b[c].equalsIgnoreCase(a))
            {
                d=c;
            }
        }
        System.out.println(+d);
        dy=2013;
        k=d;
        for(c=2014;c<=2054;c=c+1)
        {
            if(dy%4!=0)
            {
                e=365;
            }
            else
            {
                e=366;
            }
            g=e%7;
            k=-1;
            d=d+1+g;
        for(i=0;i<d;i=i+1)
        {
            k=k+1;
            if(k>=7)
            {
                k=0;
            }
        }
        if(b[k].equalsIgnoreCase("Tuseday"))
        {
            System.out.println(+c-1);
        }
        dy++;
        }
    }
}
        
        