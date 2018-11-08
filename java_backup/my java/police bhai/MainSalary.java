//program to calculate the commission of 5 salesman
import java.io.*;
class commission
{
    private int sales;
    private int travelAllowance=1600;
    private double commission;
    private double netSalary;
    public void getData()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for (int i=1;i<=5;i++)
        {
            System.out.println("enter the salary");
            sales=Integer.parseInt(br.readLine());
            calc ();
        }
    }
    public void calc()
    {
        if (sales > 30000)
        commission=sales * 0.3;
        if (sales > 20000)
        commission=sales * 0.2;
        if (sales > 10000)
        commission=sales * 0.1;
        if (sales > 5000)
        commission=sales * 0.05;
        if (sales <= 5000)
        {
            System.out.println("no commission and no travelling allowance");
            commission=0;
            travelAllowance=0;
        }
        netSalary=travelAllowance + commission;
        show();
    }
    public void show()
    {
        System.out.println("commission="+commission);
        System.out.println("net salary="+netSalary);
    }
}//end of class
public class MainSalary
{
    public static void main(String args[])throws IOException
    {
        commission obj=new commission();
        obj.getData();
    }//end of main()
}//end of main class