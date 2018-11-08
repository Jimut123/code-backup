package testpaper.proj;

import java.io.*;
class total_time
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int y1,m1,d1,h1,mn1,s1,y2,m2,d2,h2,mn2,s2,hd=0,mnd=0,sd=0;
String t1,t2;
long dd1,dd2,i,yd,md,dd,t;
void main()throws IOException
{
System.out.println("give your LOGIN details :::");
System.out.println("give year :");
y1=Integer.parseInt(br.readLine());
System.out.println("give month :");
m1=Integer.parseInt(br.readLine());
System.out.println("give day :");
d1=Integer.parseInt(br.readLine());
System.out.println("give hour(s) :");
h1=Integer.parseInt(br.readLine());
System.out.println("give minute(s) :");
mn1=Integer.parseInt(br.readLine());
System.out.println("give second(s) :");
s1=Integer.parseInt(br.readLine());
System.out.println("give am/pm :");
t1=br.readLine();
System.out.println("");
System.out.println("give your LOGOUT details :::");
System.out.println("give year :");
y2=Integer.parseInt(br.readLine());
System.out.println("give month :");
m2=Integer.parseInt(br.readLine());
System.out.println("give day :");
d2=Integer.parseInt(br.readLine());
System.out.println("give hour(s) :");
h2=Integer.parseInt(br.readLine());
System.out.println("give minute(s) :");
mn2=Integer.parseInt(br.readLine());
System.out.println("give second(s) :");
s2=Integer.parseInt(br.readLine());
System.out.println("give am/pm :");
t2=br.readLine();
System.out.println("");
System.out.println("your LOGIN details :::");
System.out.println(y1+"/"+m1+"/"+d1);
System.out.println(h1+":"+mn1+":"+s1+" "+t1);
System.out.println("");
System.out.println("your LOGOUT details :::");
System.out.println(y2+"/"+m2+"/"+d2);
System.out.println(h2+":"+mn2+":"+s2+" "+t2);
System.out.println("");
if(y1>y2)
{
System.out.println("give logout year >= login year !!!!!!!!!!");
System.exit(0);
}
else
{
//if(t1.equalsIgnoreCase("pm"))
if(s1<s2)
{
s1=s1+60;
mn1=mn1-1;
sd=s1-s2;
}
else
sd=s1-s2;
if(mn1<mn2)
{
mn1=mn1+60;
h1=h1-1;
mnd=mn1-mn2;
}
else
mnd=mn1-mn2;
if(h1<h2)
{
System.out.println("give the greater login hour(s) input !!!!!!!!!!");
System.exit(0);
}
else
hd=h1-h2;
}
day();
}
void day()
{
dd1=0;
for(i=1900;i<y1;i++)
{
if(y1%4==0||y1%400==0)
dd1=dd1+366;
else
dd1=dd1+365;
}
for(i=1;i<m1;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
dd1=dd1+31;
else
if(i==4||i==6||i==9||i==11)
dd1=dd1+30;
else
if(i==2)
{
if(y1%4==0||y1%400==0)
dd1=dd1+29;
else
dd1=dd1+28;
}
}
dd1=dd1+d1;
dd2=0;
for(i=1900;i<y2;i++)
{if(y2%4==0||y2%400==0)
dd2=dd2+366;
else
dd2=dd2+365;
}
for(i=1;i<m2;i++)
{
if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
dd2=dd2+31;
else
if(i==4||i==6||i==9||i==11)
dd2=dd2+30;
else
if(i==2)
{
if(y2%4==0||y2%400==0)
dd2=dd2+29;
else
dd2=dd2+28;
}
}
dd2=dd2+d2;
System.out.println("total day difference:"+(dd2-dd1));
yd=((dd2-dd1)/365);
t=((dd2-dd1)%365);
md=t/30;
dd=t%30;
disp();
}
void disp()
{

System.out.println("total date interval :::");
System.out.println(yd+" year(s) : "+md+" month(s) : "+dd+" day(s)");
System.out.println("total time interval :::");
System.out.println(hd+" hour(s) : "+mnd+" minute(s) : "+sd+" second(s)");
}
}
