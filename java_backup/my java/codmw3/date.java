import java.util.*;
public class date
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
long a,b,c,d,e,day=0,month,year;
System.out.println("Enter eight digit number");
a=sc.nextLong();
b=a%10000;
c=a/10000;
d=c%100;
e=c/100;
if(e>30)
{
day=e%30;
}
else
{
day=e;
}
if(e>30)
{
month=d+(e/30);
}
else
{
month = d;
}

year=b+(d/12);
if(month>12)
{
month=(d/12)+(e/30);
}
if(month ==2 && day>29 && year%4==0)
{
day=day-29;
month = month+1;
}

else if(month==2 && day >28 && year%4!=0)
{
day=day-28;
month=month+1;
}
int mm;
String mon="";
String mn[]={"January","Feburary","March","April","May","June","July","August","September","October","November","December"};
for(mm=0;mm<month;mm=mm+1)
{
mon=mn[mm];
}
System.out.println("DAY "+day+" Month : " +month+" : "+mon+ " Year " +year);
}
}
