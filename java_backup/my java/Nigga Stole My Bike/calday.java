import java.util.*;
public class calday
{
    public static void main(String args[])
   
    {
        Scanner sc=new Scanner(System.in);
        int f=2;
        System.out.println("day");
        int d=sc.nextInt();
        System.out.println("month");
        int m=sc.nextInt();
        System.out.println("year");
        int y=sc.nextInt();
        int td=0;
        for(int i=1980;i<y;i++)
        {
            if(i%4==0)
            td=td+366;
            else
            td=td+365;
        }
        for(int i=1;i<m;i++)
        td=td+30;
        
        td=td+d;
        int w=td%7;
        w=w+f;
        switch(w)
        {
            case 0:
            System.out.println("monday");
            break;
            case 1:
            System.out.println("tuesday");
            break;
            case 2:
            System.out.println("wednesday");
            break;
            case 3:
            System.out.println("thursday");
            break;
            case 4:
            System.out.println("friday");
            break;
            case 5:
            System.out.println("saturday");
            break;
            case 6:
            System.out.println("sunday");
            break;
        }
    }
}
            
        
        
        
    