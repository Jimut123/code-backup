//to input radius of circle , length and breadth of rectangle and side of square(according to user"s choice
import java.util.*;
class text
{
    public static void main()
        {
            int a,d,r,l,b,s;
            System.out.println("Press1forcircle");
            System.out.println("Press2forrectangle");
            System.out.println("Press3forsquare");
            Scanner sc = new Scanner(System.in);
            d=sc.nextInt();
            switch (d)
            {
               
              case 1:r=sc.nextInt();
                a =22/7*r*r;
                System.out.println(a);
                break;
            
            
               case 2:l=sc.nextInt();
                b=sc.nextInt();
                a=l*b;
                System.out.println(a);
                break;
            
            
               case 3:s=sc.nextInt();
                 a=s*s;
               System.out.println(a);
               break;
            
            
               default:System.out.println("error");
            }
        }
    }