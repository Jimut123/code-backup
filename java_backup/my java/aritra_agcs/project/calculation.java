package project;

import java.io.*;
class calculation
{
    public void main()throws IOException
    {
        BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 for area of square,2 for area of rectangle,3 for area of triangle,4 for area of circle");
        double rc,ac,at;
        int d,ls,lr,br,bt,ht,as,ar;
        d=Integer.parseInt(BR.readLine());
        switch (d)
        {
            case 1:System.out.println("Enter the lenght of square");
                   ls=Integer.parseInt(BR.readLine());
                   as=ls*ls;
                   System.out.println("the area of square is"+as);
                   break;
            case 2:System.out.println("Enter the lenght of rectangle,breadth of rectangle");
                   lr=Integer.parseInt(BR.readLine());
                   br=Integer.parseInt(BR.readLine());
                   ar=lr*br;
                   System.out.println("the area of rectangle"+ar);
                   break;
            case 3:System.out.println("Enter the base and height of triangle");
                   bt=Integer.parseInt(BR.readLine());
                   ht=Integer.parseInt(BR.readLine());
                   at=.5*bt*ht;
                   System.out.println("the area of triangle is"+at);
                   break;
            case 4: System.out.println("Enter the radius of circle") ;
                    rc=Double.parseDouble(BR.readLine());
                    ac=2*3.14*rc*rc;
                    System.out.println("the area of cicle is"+ac);
                    break;
            default:System.out.println("Wrong choice");
        }
    }
}