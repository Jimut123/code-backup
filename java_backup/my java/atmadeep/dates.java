import java.io.*;
class dates
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
int year,i,t,n;
String day;
String ar[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
System.out.println("Enter the year and day:");
year=Integer.parseInt(input.readLine());
day=input.readLine();
t=0;
for(i=0;i<7;i++)
if(day.compareTo(ar[i])==0)
{
t=i;
break;
}

if((year%400==0)||(year%4==0))
n=366;
else
n=365;
for(i=1;i<n;i++)
{
t=t+1;
if(t>=7)
t=0;
}
System.out.println("The reqd day is:" +ar[t]);
}
}