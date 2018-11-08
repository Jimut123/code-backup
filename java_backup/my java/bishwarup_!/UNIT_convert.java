import java.io.*;
class UNIT_convert
{
public static void main(String args[])throws IOException
{
int b=0,ch,kb;
double m,k=0,g,p=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("ENTER 1 TO CONVET KB TO BYTE");
System.out.println("ENTER 2 TO CONVET METER TO INCH");
System.out.println("ENTER 3 TO CONVET GALLON TO LITER");
System.out.println("ENTER YOUR CHOICE 1,2,3");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("ENTER YOUR VALUE IN KB");
kb=Integer.parseInt(br.readLine());
b=kb*1024;
System.out.println("THE VALUE INT BYTES:"+b);
break;
case 2:
System.out.println("ENTER YOUR VALUE IN METER");
m=Integer.parseInt(br.readLine());
k=m*39.43;
System.out.println("THE VALUE IN INCH:"+k);
break;
case 3:
System.out.println("ENETER YOUR VALUE IN GALLON");
g=Integer.parseInt(br.readLine());
p=g*20/9;
System.out.println("THE VALUE IN LITER:"+p);
break;
default:
System.out.println("WRONG CHOICE!!");
}
}
}
