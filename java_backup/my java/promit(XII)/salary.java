import java.io.*;
public class salary extends employee
{
int da;int hra;int total=0;
public double calc()throws IOException
{
super.accept();
da=(10*sal)/100;
hra=(10*sal)/100;
total=da+hra+sal;
return total;
}
public void disp1()
{
super.disp();
System.out.println("The da="+da);
System.out.println("The hra="+hra);
System.out.println("The total="+total);
}
}