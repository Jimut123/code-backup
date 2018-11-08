import java.io.*;
class week
{
void daysofweek(int dysno)
{
switch (dysno)
{
case 1:
{
System.out.println("SUNDAY");
break;
}
case 2:
{
System.out.println("MONDAY");
break;
}
case 3:
{
System.out.println("TUESDAY");
break;
}
case 4:
{
System.out.println("WEDNESDAY");
break;
}
case 5:
{
System.out.println("THURSDAY");
break;
}
case 6:
{
System.out.println("FRIDAY");
break;
}
case 7:
{
System.out.println("SATURDAY");
break;
}
default:System.out.println("WRONG CHOICE:");
}
}
public static void main (String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
week ob = new week();
int j;
System.out.println("ENTER THE DAY NO.::");
j = Integer.parseInt(cd.readLine());
ob.daysofweek(j);
}
}




























