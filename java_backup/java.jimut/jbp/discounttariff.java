import java . io.*;
class discounttariff
{
public static void main(String args[])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
char ch;
int p,dp;
float ddc=0, dpc=0;
System.out.println("Enter the price:::::");
p = Integer.parseInt(cd.readLine());
System.out.println("Enter the development price:::::");
dp = Integer.parseInt(cd.readLine());
System.out.println("Enter 'G' FOR GROUND FLOOR ,'F' FOR FIRST FLOOR,'S'FOR SECOND FLOOR,'T' FOR THIRD FLOOR:::::");
ch = (char)(cd.read());
switch(ch)
{
case 'G':
{
ddc=dp-((float)(0.08*dp));
dpc=p-((float)(0.1*p));
break;
}
case 'F':
{
ddc=dp-((float)(0.03*dp));
dpc=p-((float)(0.04*p));
break;
}
case 'S':
{
ddc=dp-((float)(0.04*dp));
dpc=p-((float)(0.05*p));
break;
}
case 'T':
{
ddc=dp-((float)(0.1*dp));
dpc=p-((float)(0.75*p));
break;
}
default: System.out.println("wrong choice!!!!!");
}
System.out.println("The new price:::::::"+dpc);
System.out.println("The new development charge::::::::"+ddc);
}
}


















