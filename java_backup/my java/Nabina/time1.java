import java.io.*;
class time1
{
public static void main(String args[])throws IOException
{
int i,d,m,y,days=0;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter date:");

System.out.println("Enter day:");
d=Integer.parseInt(input.readLine());

System.out.println("Enter month:");
m=Integer.parseInt(input.readLine());

System.out.println("Enter year:");
y=Integer.parseInt(input.readLine());
days=0;
for(i=1;i<m;i++)
{
if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
days=days+31;
else
if(i==2)
days=days+29;
else
days=days+30;
}
//System.out.println("No. of days: "+days);
days=days+d;
System.out.println("No. of days: "+days);
}
}
