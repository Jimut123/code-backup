import java .io.*;
import java.lang.*;
public class time2
{
int hour1,min1,hour2,min2,h,m;
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
void accept()throws IOException
{
System.out.println("ENTER THE FIRST HOUR :");
hour1 = Integer.parseInt(cd.readLine());
System.out.println("ENTER THE FIRST MINUTES");
min1 = Integer.parseInt(cd.readLine());
System.out.println("ENTER THE SECOND HOUR :");
hour2 = Integer.parseInt(cd.readLine());
System.out.println("ENTER THE SECOND MINUTES");
min2 = Integer.parseInt(cd.readLine());
}
void add()
{
int s;
m = min1 + min2;
h = hour1 + hour2;
if (m>60)
{
s = m - 60;
m = s;
h = h + 1;
}
}

void display()
{
System.out.println("HOURS: "+h+"MINS:"+m);
}
public static void main (String args[])throws IOException 
{
time2 ob = new time2();
ob.accept();
ob.add();
ob. display();
}
}
