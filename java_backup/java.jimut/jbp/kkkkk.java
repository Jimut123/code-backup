import java .io.*;
import java.lang.*;
public class kkkkk
{
public static void main (String args[])throws IOException 
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
int n,sn=0,se=0,so=0;
do
{
System.out.println("enter any number or zero to terminate:");
n = Integer.parseInt(cd.readLine());
if (n<0)
{
sn = sn + n;
}
else if ((n>0)&&(n%2!=0))
{
so = so + n;
}
else if ((n>0)&&(n%2==0))
{
se = se + n;
}
}
while(n!=0);
System.out.println("sum of positive even nos. : "+se);
System.out.println("sum of positive odd nos. :"+so);
System.out.println("sum of negetive numbers :"+sn);
}
}


