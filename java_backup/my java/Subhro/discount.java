//program to calculate the discount
import java.io.*;
class discount
{
    private string name;
    private double ticketCharges;
    private double discount;
    private double netAmount;
    public void show()throws IOException
    {
        for (int i=1;i<=15;i++)
        {
            get();
            System.out.println("  "+i+"\t"+name+"\t"+ticketCharges+"\t"+netAmount+"\t"+discount);
        }
    }
    public void get()throws IOException
    {
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    System.out.println("enter the name");
    name=br.readLine();
    System.out.println("enter the charges of the ticket");
    ticketCharges=Double.parseDouble(br.readLine());    
    System.out.println("serial number"+"\t"+"name"+"\t"+"ticketCharges"+"\t"+"net amount"+"\t"+"discount");
    }
    public void calculate ()
    {
        if (ticketCharges>70000)
        discount=c*0.18;
        if (ticketCharges>=55001)
        discount=c*0.16;
        if (ticketCharges>=35001)
        discount=c*0.12;
        if (ticketCharges>=25001)
        discount=c*0.1;
        else
        discount=ticketCharges*0.02;
    }
}//end of class
public class MainDiscount
{
    public static void main(String args[])throws IOException
        {
        Discount obj=new Discount();
        obj.show();
        }
}//end of main class
        