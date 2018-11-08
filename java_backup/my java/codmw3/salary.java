import java.util.*;
public class salary
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double bp,da,hra,ta,ea;
int yr;
String name; 
System.out.println("Enter name " );
name=sc.nextLine();
System.out.println("enter years ofexperience");
yr=sc.nextInt();
System.out.println("Enter basic pay");
bp=sc.nextDouble();
salarycal a=new salarycal();
da=a.deall(bp);
hra=a.husrnt(bp);
ta=a.trvall(bp);
ea=a.entall(bp);
double net;
net = bp+da+hra+ta+ea;
System.out.println("name" +name);
System.out.println("DA      HRA     TA    EA");
System.out.println(+da+"        " +hra +"      " +ta+ "     " +ea);
System.out.println("Salary = "+ net);
System.out.println("Years ofexperience" +yr);
}
} 