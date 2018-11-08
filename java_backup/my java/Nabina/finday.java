import java.io.*;
class finday
{
public static void main(String args[])throws IOException
{
int i,d,m,y,count=0,f,diff;
String day,a="";
String s[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter today's date:");
System.out.println("Enter day:");
d=Integer.parseInt(input.readLine());
System.out.println("Enter month:");
m=Integer.parseInt(input.readLine());
System.out.println("Enter year:");
y=Integer.parseInt(input.readLine());
System.out.println("Enter day it was on 1.1."+y+":");
day=input.readLine();
for(i=1;i<m;i++)
{
if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
{
count=count+31;
}
else
if((i==4)||(i==6)||(i==9)||(i==11))
{
count=count+30;
}
else
if(i==2)
{
if((y%4==0)||(y%400==0))
{
count=count+29;
}
else
count=count+28;
}
}
count=count+d;
f=0;
a="";
for(i=0;i<7;i++)
{
a=s[i];
if(a.compareTo(day)==0)
{
f=i;
break;
}
}
diff=7-f;
a="";
int t=f;
for(i=1;i<=count;i++)
{
if(t>=7)
t=0;
a=s[t];
t++;
}
System.out.println("The day was:"+a);
}
}