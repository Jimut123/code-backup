import java.io.*;
class Parking_lot
{
    int vno;
    int hours;
    double bill;
    
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter vehicle number");
        int vno=Integer.parseInt(br.readLine());
        System.out.println("Enter no. of hours");
        int hours=Integer.parseInt(br.readLine());
    }//End of input()
    
    void calculate()
    {
        if(hours<=0)
        System.out.println("Wrong input");
        else
        if(hours>0&&hours<=1)
        bill=hours*3.0;
        else
        bill=3.0+(hours-1)*3.0;
    }//End of calculate()
    
    void display()
    {
        System.out.println("Vehicle no="+vno);
        System.out.println("Total time="+hours);
        System.out.println("Total Charges="+bill);
    }//End of display()
    
    public static void main()throws IOException
    {
        Parking_lot pk=new Parking_lot();
        pk.input();
        pk.calculate();
        pk.display();
    }//End of main()
}//End of class

    