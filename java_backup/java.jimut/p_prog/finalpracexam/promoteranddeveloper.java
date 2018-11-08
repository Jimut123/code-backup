package finalpracexam;


import java.io.*;
class promoteranddeveloper
{
public static void main(String[]args)throws IOException
{
int p;
double d=0,dc=0,amt=0;
char ch;
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
System.out.println("Enter price of flat:");
p=Integer.parseInt(cd.readLine());
System.out.println("Enter 'G' for ground floor,'F' for first floor,'S'for second floor and 'T' for third floor");
System.out.println("Enter your choice:");
ch=(char)(cd.read());
switch(ch)
{
case 1:
{
d=p*(10.0/100.0);
dc=p*(8.0/100.0);
amt=(double)(p-d-dc);
{
System.out.println("Discount=Rs."+d);
System.out.println("Discount char=Rs."+dc);
System.out.println("Net amount to be paid=Rs."+amt);
}
break;
}
case 2:
{
d=p*(8.0/100.0);
dc=p*(6.0/100.0);
amt=(double)(p-d-dc);
{
System.out.println("Discount=Rs."+d);
System.out.println("Discount char=Rs."+dc);
System.out.println("Net amount to be paid=Rs."+amt);
}
break;
}
case 3:
{
d=p*(6.0/100.0);
dc=p*(7.0/100.0);
amt=(double)(p-d-dc);
{
System.out.println("Discount=Rs."+d);
System.out.println("Discount char=Rs."+dc);
System.out.println("Net amount to be paid=Rs."+amt);
}
break;
}
case 4:
{
d=p*(5.0/100.0);
dc=p*(8.0/100.0);
amt=(double)(p-d-dc);
{
System.out.println("Discount=Rs."+d);
System.out.println("Discount char=Rs."+dc);
System.out.println("Net amount to be paid=Rs."+amt);
}
break;
}
default:
{
System.out.println("WRONG CHOICE");
}
}
}
}