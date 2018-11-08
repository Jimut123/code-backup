
class charge
{
public static void main (int unit)
{
double charge;
charge=0;
if(unit <=75)
charge=0;
else
if(unit <=150)
charge=0+((unit-75)*.50);
else
if(unit<=300)
charge=0+(75*.50)+((unit-150)*1.50);
else
if(unit>300)
charge=0+(75*.50)*(150*1.50)+((unit-300)*2.00);
System.out.print(charge);
}
}