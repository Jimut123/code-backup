import java.io.*;
class times2
{
public static void main(String args[])throws IOException
{
int i,t=0,d,n,c=0;
String s[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
String day[]={"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
String f="";
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any no. <=365");
n=Integer.parseInt(input.readLine());
t=0;
d=n;
for(i=0;i<12;i++)
{
t++;
if((t==1)||(t==3)||(t==5)||(t==7)||(t==8)||(t==10)||(t==12))
{
if(d>31)
{
d=d-31;
}
else
if(d<=31)
{
System.out.println("Date is:"+d+" "+s[i]+",2009");
break;
}
}
else
if((t==4)||(t==6)||(t==9)||(t==11))
{
if(d>30)
{
d=d-30;
}
else
if(d<=30)
{
System.out.println("Date is:"+d+" "+s[i]+",2009");
break;
}
}
else if(t==2)
{
if(d>28)
{
d=d-28;
}
else
if(d<=28)
{
System.out.println("Date is:"+d+" "+s[i]+",2009");
break;
}
}
}
c=0;
for(i=1;i<=n;i++)
{
if(c>=7)
c=0;

f=day[c];
c++;
}
System.out.println("Day was : "+f);
}
}