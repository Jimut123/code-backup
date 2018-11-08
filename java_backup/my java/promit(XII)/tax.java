import java.io.*;
public class tax extends salary
{
double IT=0;double PF=0;double Net=0;
public double calc()throws IOException
{
super.calc();
IT=(10*sal)/100;
PF=(10*total)/100;
Net=IT-PF;
return Net;
}
public void disp2()
{
super.disp1();
System.out.println("The net Salary is="+sal);
}
}
