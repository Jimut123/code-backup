//department-inheritance
import java.util.*;
class Department
{
   protected String dName;
   protected String dID;
   Department()
   {
       dName="";
       dID="";
    }
    Department(String name,String ID)
    {
        dName=name;
        dID=ID;
    }
    public void show()
    {
        System.out.println("name of department : "+dName);
        System.out.println("department ID : "+dID);
    }
}
class Employee extends Department
{
   double salary;
   String eName;
   String eID;
   Employee(String dnm,String did,double s,String enm,String eid)
   {
       super(dnm,did);
       salary=s;
       eName=enm;
       eID=eid;
    }
    public void show()
    {
        if (dName.equalsIgnoreCase("management"))
         salary=salary+0.08*salary;
        else if (dName.equalsIgnoreCase("hr"))
         salary=salary+0.1*salary;
        else if (dName.equalsIgnoreCase("execution"))
         salary=salary+0.12*salary;
        super.show();
        System.out.println("employee name : "+eName+"\n employee ID : "+eID+"\n new salary = Rs."+salary);
    }
}
public class EmployeeMain
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter department name : ");
        String name=sc.next();
       System.out.println("enter department ID : ");
        String d1=sc.next();
       System.out.println("enter current salary : ");
        double sal=sc.nextDouble();
       System.out.println("enter emloyee name : ");
        String e1=sc.next();
       System.out.println("enter employee ID : ");
        String e2=sc.next();
       Employee obj=new Employee(name,d1,sal,e1,e2);
       obj.show();
    }
}
