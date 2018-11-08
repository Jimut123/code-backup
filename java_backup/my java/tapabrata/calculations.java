import java.io.*;
class calculations extends employee_details
{double da,hra,gs;
public void calculations()throws IOException
{super.inputdata();
da=(.15*super.s);
hra=(.10*super.s);
gs=s+da+hra;
}
public void output()
{System.out.println("Name of the employee" +n);
System.out.println("Designation of the employee" +m);
System.out.println("Basic salary of the employee" +s);
System.out.println("Dearness allowance" +da);
System.out.println("House rent allowance" +hra);
System.out.println("Gross salary" +gs);
}
}