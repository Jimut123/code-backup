import java.io.*;
class payroll extends employee1
{
double da;
double hra;
double total;
void clac()throws IOException
{
super.input();
da=(10*basic)/100;
hra=3000;
total=basic+da+hra;
}
void disp1()
{
super.disp();
System.out.println("Total :"+total);
}
}