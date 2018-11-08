import java.io.*;
class Date
{
public static void main (String args [])throws IOException
{
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader x = new BufferedReader(read);
String s[] = {"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST", "SEPTEMBER", "OCTOBER","NOVEMBER","DECEMBER"};
int i = 0,d,m,y;
String str = "";
System.out.println("ENTER THE DATE IN DD MM YYYY FORMAT:");
d = Integer.parseInt(x.readLine());
m = Integer.parseInt(x.readLine());
y = Integer.parseInt(x.readLine());
System.out.println("DATE : "+d+"/"+m+"/"+y);
if((m < 1)||(m > 12)||(d < 1)||(d > 31))
{
System.out.println("INVALID DATE");
}
if((y % 4) == 0)
{
if((m >= 1)&&(m != 2)&&(m <= 12))
{
if(d == 31)
{
switch(m)
{
case 1:
str = s[0];
break;
case 3:
str = s[2];
break;
case 5:
str = s[4];
break;
case 7:
str = s[6];
break;
case 8:
str = s[7];
break;
case 10:
str = s[9];
break;
case 12:
str = s[11];
break;
default:
System.out.print("INVALID DATE");
}
System.out.println("VALID DATE:");
System.out.println(d+"TH "+str+" "+y);
}
if(d <= 30)
{
str = s[m-1];
System.out.println("VALID DATE:");
System.out.println(d+"TH "+str+" "+y);
 }
}
if((m == 2)&&(d <= 29))
{
str = s[1];
System.out.println("VALID DATE:");
System.out.println(d+"TH "+str+" "+y);
 }
}
if(((y % 4) != 0))
{
if((m >= 1)&&(m != 2)&&(m <= 12))
{
if(d == 31)
{
switch(m)
{
case 1:
str = s[0];
break;
case 3:
str = s[2];
break;
case 5:
str = s[4];
break;
case 7:
str = s[6];
break;
case 8:
str = s[7];
break;
case 10:
str = s[9];
break;
case 12:
str = s[11];
break;
default:
System.out.println("INVALID DATE");
}
System.out.println("VALID DATE:");
System.out.println(d+"TH "+str+" "+y);
}
if(d <= 30)
{
str = s[m-1];
System.out.println("VALID DATE:");
System.out.println(d+"TH "+str+" "+y);
 }
}
if((m == 2)&&(d <= 28))
{
str = s[1];
System.out.println("VALID DATE:");
System.out.println(d+"TH "+str+" "+y);
   }
  }
 }
}
