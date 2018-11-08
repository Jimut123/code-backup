import java.io.*;
class UnitCons
{
public static void main(double units)
{
double billamount;
System.out.print("Enter number of Units="+units);
if(units>350)
billamount=2000;
else if(units>200)
billamount=1650;
else if(units>125)
billamount=1225;
else if(units>75)
billamount=750;
else
billamount=475;
System.out.println("Bill Amount="+billamount);
}
}