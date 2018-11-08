package finalprojectwork.twowhileanddowhile;


import java.io.*;
class Avrgwhile
{
public void main()throws IOException
{
int i,n;
double average;
double sum;
double x;
sum=0;
average=0;
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
System.out.println("How Many Numbers You Want To Enter=");
String p=cd.readLine();
n=Integer.parseInt(p);
i=0;
while(i<=n-1)
{
System.out.println("Enter Numbers=");
String p1=cd.readLine();
sum=sum+x;
++i;
}
average=sum/n;
System.out.println("Sum of These Numbers="+sum);
System.out.println("Average of These Numbers="+average);
}
}