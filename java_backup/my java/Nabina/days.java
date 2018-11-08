import java.io.*;
class days
{
public static void main(String args[])throws IOException
{
int days,d1,d2,m1,m2,y1,y2,p,p2,i;
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any date:");
System.out.println("Enter day:");
d1=Integer.parseInt(input.readLine());
System.out.println("Enter month:");
m1=Integer.parseInt(input.readLine());
System.out.println("Enter year:");
y1=Integer.parseInt(input.readLine());

System.out.println("Enter another date:");
System.out.println("Enter day:");
d2=Integer.parseInt(input.readLine());
System.out.println("Enter month:");
m2=Integer.parseInt(input.readLine());
System.out.println("Enter year:");
y2=Integer.parseInt(input.readLine());
days=0;
p=y2-y1;
if(p>0)
{
if((m1==1)||(m1==3)||(m1==5)||(m1==7)||(m1==8)||(m1==10)||(m1==12))
days=31-d1;
else
if(m1==2)
{
if((y1%4==0)||(y1%400==0))
days=29-d1;
else
days=28-d1;
}
else
days=30-d1;
//System.out.println(days);
for(i=m1+1;i<=12;i++)
{
if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
days=days+31;
else
if(i==2)
{
if((y1%4==0)||(y1%400==0))
days=days+29;
else
days=days+28;
}
else
days=days+30;
}
//System.out.println(days);
for(i=y1+1;i<y2;i++)
{
if((y1%4==0)||(y1%400==0))
days=days+366;
else
days=days+365;
}
//System.out.println(days);
for(i=1;i<m2;i++)
{
if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
days=days+31;
else
if(i==2)
{
if((y2%4==0)||(y2%400==0))
days=days+29;
else
days=days+28;
}
else
days=days+30;
}
//System.out.println(days);
days=days+d2;
//System.out.println(days);
}
else
if(p==0)
{
days=0;
if((m1==1)||(m1==3)||(m1==5)||(m1==7)||(m1==8)||(m1==10)||(m1==12))
days=31-d1;
else
if(m1==2)
{
if((y1%4==0)||(y1%400==0))
days=29-d1;
else
days=28-d1;
}
else
days=30-d1;
for(i=m1+1;i<m2;i++)
{
if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12))
days=days+31;
else
if(i==2)
{
if((y1%4==0)||(y1%400==0))
days=days+29;
else
days=days+28;
}
else
days=days+30;
}
days=days+d2;
}
System.out.println("Total Day:"+days);
}
}
