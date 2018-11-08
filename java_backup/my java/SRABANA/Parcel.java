import java.util.*;
class Parcel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double w,ch;
        System.out.println("Enter name of your city:");
        System.out.println("Enter K for Kolkata");
        System.out.println("Enter M for Mumbai");
        System.out.println("Enter C for Chennai");
        System.out.println("Enter D for Delhi");
        String c=sc.nextLine();
        System.out.println("Enter weight of your parcels in kg");
        w=sc.nextDouble();
        if(c.equals ("K"))
        {
            System.out.println("Your city is Kolkata");
            if(w<=100)
            ch=w*45;
            else
            ch=w*75;
        }
        else if(c.equals("M"))
        {
            System.out.println("Your city is Mumbai");
            if(w<=100)
            ch=w*65;
            else
            ch=w*95;
        }
        else if (c.equals("C"))
        {
            System.out.println("Your city is Chennai");
            if(w<=100)
            ch=w*75;
            else
            ch=w*115;
        }
        else
        {
            System.out.println("Your city is Delhi");
            if(w<=100)
            ch=w*90;
            else
            ch=w*125;
        }
        System.out.println("The charge is:" +ch);
    }
}
        