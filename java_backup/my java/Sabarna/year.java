import java .io.*;
class year
{
public static void main (String args[])throws IOException
{
int a,b;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter data");
a = Integer.parseInt(br.readLine());
//b=Integer.parseInt(br.readLine());
if(a%4==0|| a%400==0)
System.out.print("Leap Year");
else
System.out.print("Non leap year");
}
}