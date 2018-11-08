import java.io.*;
class lastsunm
{
public static void main(String args[])throws IOException
{
int f=0,i,j,p=0,q,k,m=1,g=1,y,days=0,d1,d2,m1,m2,y1,y2,y3,p2;
int mth1[]={31,28,31,30,31,30,31,31,30,31,30,31};
int mth2[]={31,29,31,30,31,30,31,31,30,31,30,31};
String d,s;
String day[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};

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

System.out.println("Enter day it was on : 1/1/"+y1);
d=input.readLine();

y=y2-y1;

if((y1%4==0)||(y1%400==0))
{
f=1;
}
for(i=0;i<7;i++)
{
s=day[i];
if(d.compareTo(s)==0)
{
p=i;
break;
}
}

if(y>0)
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

for(i=y1+1;i<y2;i++)
{
if((y1%4==0)||(y1%400==0))
days=days+366;
else
days=days+365;
}

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
days=days+d2;
}
else
if(y==0)
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

q=7-p;
k=0;
g=1;
y3=y1;
for(i=0;i<=days;i++)
{
m=k+1;
q=q+7;
if(f==0)
{
if(g==4)
{
System.out.println("Sunday : "+q+"/"+m+y3);
}
if(q>mth1[k])
{
q=q-mth1[k];
k++;
}
if(i==365)
y3++;
}

else
{
if((g==4)||(g==5))
{
System.out.println("Sunday : "+q+"/"+m+y3);
}
if(q>mth2[k])
{
q=q-mth2[k];
k++;
}
if(i==366)
y3++;
}

g++;
}

}
}