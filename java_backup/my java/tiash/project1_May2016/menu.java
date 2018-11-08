package project1_May2016;

import java.util.*;
class menu
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,i;
        System.out.println("press 1 for sum");
        System.out.println("press 2 for difference");
        System.out.println("press 3 for product");
        System.out.println("Enter choice");
        i=sc.nextInt();
        switch(i)
        {
            case 1:a=sc.nextInt();
                   b=sc.nextInt();
                   c=a+b;
                   System.out.print(c);
                   break;
            case 2:a=sc.nextInt();
                   b=sc.nextInt();
                   c=a-b;
                   System.out.print(c);
                   break; 
            case 3:a=sc.nextInt();
                   b=sc.nextInt();
                   c=a*b;
                   System.out.print(c);
                   break;
            default:System.out.print("Wrong choice");
        }
    }
}