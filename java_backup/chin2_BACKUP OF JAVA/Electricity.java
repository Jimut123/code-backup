import java.util.*;
public class Electricity
{
    double cal( int u )
    {
        double c = 0;
        if(u<=100)
        {
            c = (u*1.25);
        }
        else if((u>100)&&(u<=200))
        {
            c = ((1.25*100)+(u-100)*1.50);
        }
        else
        {
            c = ((1.25*100)+(100*1.50)+(u-200)*1.80);
        }
        return(c);
    }
    public static void main(String args[])
    {
        int prev , pres , un;
        double amt = 0;
        String name , cn;
        Scanner in = new Scanner(System.in);
        Electricity ob = new Electricity();
        System.out.println("ENTER CONSUMER'S NAME :");
        name = in.nextLine();
        System.out.println("ENTER CONSUMER NUMBER :");
        cn = in.nextLine();
        System.out.println("ENTER PREVIOUS READING :");
        prev = in.nextInt();
        System.out.println("ENTER PRESENT READING :");
        pres = in.nextInt();
        un = pres - prev ;
        amt = ob.cal(un);
        System.out.println("CONSUMER NO.\t NAME\t\t UNIT CONSUMED\t AMOUNT");
        System.out.println(cn+"\t"+name+"\t\t"+un+"\t"+amt);
    }
}