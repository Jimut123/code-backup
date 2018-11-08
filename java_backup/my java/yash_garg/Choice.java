import java.util.*;
class Choice
{
    /* This program is a menu driven program and it inputs the user choice */
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter 1 for conversion of temprature");
        System.out.println(" Enter 2 for the area of a circle ");
        System.out.println(" Enter 3 for the perimeter of a rectangle ");
        System.out.println(" Enter 4 for swapping the values of variables ");
        System.out.println(" Enter the user choice ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                   System.out.println(" Enter the temprature in farenheit ");
                   double tf=sc.nextDouble();
                   double tc=((tf-32)*5)/9;
                   System.out.println(" The temprature in celcius is "+tc);
                   break;
            case 2:
                   double p=3.14,r,ac;
                   System.out.println(" Enter the radius of the circle ");
                   r=sc.nextDouble();
                   ac=p*(r*r);
                   System.out.println(" The area of the circle is "+ac);
                   break;
            case 3:
                   double l,b,per;
                   System.out.println(" Enter the length and the breath of a rectengle");
                   l=sc.nextDouble();
                   b=sc.nextDouble();
                   per=2*(l+b);
                   System.out.println(" The perimeter of the rectangle is "+per);
                   break;
            case 4:
                   System.out.println(" Enter the values of a and b1 ");
                   double a=sc.nextDouble();
                   double b1=sc.nextDouble();
                   double tmp=a;
                   a=(int)b1;
                   b1=(int)tmp;
                   System.out.println("The swapped value of a is "+a+" and b1 is "+b1);
                   break;
            default: 
                   System.out.println("Wrong Choice");
        }
    }
}