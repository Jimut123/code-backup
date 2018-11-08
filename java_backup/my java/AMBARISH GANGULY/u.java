
import java.io.*;
class u
{

    String s,s4,s5;
public static void main(int unit)
{
double charge;
if (unit<=75)
charge=0;
else
if (unit <=150)
charge = 0+(unit-75)*.50;
else
if (unit <225)
charge=0+(75*.50)+(unit-150)*1.00;
else
if (unit <=300)
charge =0+(75*.50)+(75*1.00)+(unit-225)*2.50;
else
charge=0+(75*.50)+(75*1.00)+(75*2.25)+(unit-300)*3.50;
System.out.println(charge);
}
}
