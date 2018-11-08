package finalpracexam;


import java.io.*;
class weeklywages
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int h;
double k,w=0;
System.out.println("Enter no of hrs:");
h=Integer.parseInt(cd.readLine());
System.out.println("Enter rate:");
k=Double.parseDouble(cd.readLine());
if(h<=48)
{
w=k*h;
}
else if((h>48)&&(h<=56))
{
w=((k*48)+(1.25*k*(h-48)));
}
else if(h>56)
{
w=((k*48)+(1.25*k*8)+(1.5*k*(h-56)));
}
System.out.println("The no of hrs="+h);
System.out.println("Weekly wages=Rs."+w);
}
}