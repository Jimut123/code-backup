import java.util.*;
class Simpleinterest
{
    public static void main(String args[])
    {
        double p,r,t,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal,rate,time");
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        si=(p*r*t)/100;
        System.out.println("Simple interest+ "+si);
    }
}

    