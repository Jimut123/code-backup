import java.io.*;
import java.lang.*; 
class Loan extends Bank
{
    int fd_no,inte;
    float amt,tot;
    void input()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        super.input();
        System.out.println("Enter the Loan no. (int): ");
        fd_no = Integer.parseInt(cd.readLine());
        System.out.println("Enter the amt : (int)");
        inte = Integer.parseInt(cd.readLine());
        System.out.println("Enter the interest : (float)");
        amt = Float.parseFloat(cd.readLine());
       
    }
    void cal()throws IOException
    {
        tot = (float)amt*(inte/100)+(float)super.init_dep;
        System.out.println("Calculating ....");
    }
    void show()
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        super.show();
        System.out.println("Amount : "+amt);
        System.out.println("Interest : "+inte);
        System.out.println("FD no. : "+fd_no);
        System.out.println("Total : "+tot);
    }
}
