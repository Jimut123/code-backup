import java . io.*;
import java.lang.*;
class tariff
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int k,h;
double money=0.00;
System.out.println("Enter the price:: ");
k= Integer.parseInt(cd.readLine());
System.out.println("Enter the hour:: ");
h= Integer.parseInt(cd.readLine());
if(h<=48)
{
money = k*1;
}
if((h>=48)&&(h<=56))
{
money = k*1.25;
}
if(h>56)
{
money = k*1.5;
}

System.out.println("Rate::::::"+money);
}
}

