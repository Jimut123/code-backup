public class switchcase5
{
    public static void main(int x,int a,int y,int b,int d)
    {
        System.out.println("press 1 for odd/even no.checking");
        System.out.println("press 2 for leap year checking");
        System.out.println("press 3 for swaping 2 no.s using 3rd variable");
        switch(x)
        {
            case 1:if(a%2==0)
                   System.out.println("a even no.");
                   else if(a%2!=0)
                   System.out.println("a odd no.");
                   break;
            case 2:if(y%4==0||y%400==0)
                   System.out.println("a leap year");
                   else
                   System.out.println("not a leap year");
                   break;
            case 3:int c;
                   c=b;
                   b=d;
                   d=c;
                   System.out.println(b+","+d);
                   break;
            default:System.out.println("wrong choice");
                    break;
                }
            }
        }
        