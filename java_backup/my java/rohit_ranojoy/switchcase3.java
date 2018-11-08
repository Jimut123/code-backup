public class switchcase3
{
    public static void main(int a,int b,int c,int d,int e,int f)
    {
        System.out.println("press 1 for isoceles/equilateral/scalene");
        System.out.println("press 2 for swap two nos.");
        switch(a)
        {
            case 1:if(b==c&&b==d&&c==d)
                   System.out.println("a equilateral triangle");
                   else if(b==c||b==d||c==d)
                   System.out.println("a isoceles triangle");
                   else
                   System.out.println("a scalene triangle");
                   break;
            case 2:e=f+e;
                   f=e-f;
                   e=e-f;
                   System.out.println(e+","+f);
                   break;
            default:System.out.println("wrong choice");
                    break;
                }
            }
        }
        
        