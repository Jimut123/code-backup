import java.io.*;
class date
{
public static void main(String args[])throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
String s[]={"Monday","tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
String s1[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
System.out.println("Entr date in dd/mm/yyyy");
int d=Integer.parseInt(input.readLine());
int m=Integer.parseInt(input.readLine());
int y=Integer.parseInt(input.readLine());
System.out.println("Enter d 1st day of the year");
String s2=input.readLine();
int t=0,i;
for(i=0;i<7;i++)
if(s[i].compareTo(s2)==0)
{
t=i;
}
int dd=0;
for(i=1;i<m;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
dd=dd+31;
else if(i==2)
{
if(y%4==0||y%400==0)
dd=dd+29;
else
dd=dd+28;
}
else
dd=dd+30;
}
dd=dd+d;
String s4="";
for(i=1;i<=dd;i++)
{
s4=s[t];
t++;
if(t>6)
t=0;
}
System.out.println("the day is" +s4);
System.out.println("the month is" +s1[m-1]);
}
}



