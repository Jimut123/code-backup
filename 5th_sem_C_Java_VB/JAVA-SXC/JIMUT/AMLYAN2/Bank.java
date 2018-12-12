import java.io.*;
import java.lang.*;
class Bank
{
    String cust_code,cust_name,acc_type;
    int init_dep;
    void input()throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        System.out.println("\f");
        System.out.println("\n Enter the name (str):");
        cust_name = cd.readLine();
        System.out.println("\n Enter the customer account type(\"minor\"/\"major\") (str):");
        acc_type = cd.readLine();
        System.out.println("\n Enter the customer code (str):");
        cust_code = cd.readLine();
        System.out.println("\n Enter the initial deposit (int):");
        init_dep = Integer.parseInt(cd.readLine());
    }
    void show()
    {
        System.out.println("\n The name :"+cust_name);
        System.out.println("\n The customer account type(\"minor\"/\"major\") :"+acc_type);
        System.out.println("\n The customer code :"+cust_code);
        System.out.println("\n The initial deposit :"+init_dep);
    }
}