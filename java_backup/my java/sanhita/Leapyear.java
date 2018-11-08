import java.util.*;
class Leapyear
{
    public static void main(String args[])
    {
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        y=sc.nextInt();
        if(y%100==0)
        {
            if((y%4==0)||(y%400==0))
            System.out.println("Leap year");
            else
             System.out.println(" not Leap year");
            }
        }
    }
    
         