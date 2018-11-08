package special;

//prints sunday for desired year
import java.io.*;
class datesunday1
{
public static void main(String args[])throws IOException
{
int i,j,p=0,q,m=1,g=1,t,y,p1;
String d;
String day[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the year:");
y=Integer.parseInt(input.readLine());
System.out.println("Enter the day it was on 1/1/"+y+" :");
d=input.readLine();
if(y %4==0 || y%400==0)
{
p1=366;
t=29;
}
else
{
p1=365;
t=28;
}
for(i=0;i<7;i++)
{
if(d.compareTo(day[i])==0)
{
p=i;
break;
}
}
if(t==29)
p=p-1;
g=1;
q=0;
for(i=1;i<=p1;i++)
{
q=q+1;
p=p+1;
if(p>6)
{
p=0;
if(q>t)
{
if(m==2)
{
m++;
q=q-t;
}
else
if(m==4||m==6||m==9||m==11)
  {
  if(q>30)
  {
  m++;
  q=q-30;
  }
  //System.out.println("Sunday "+g+". :"+q+"/"+m+"/2009");
  }
  else
  if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
  {
  if(q>31)
  {
  m++;
  q=q-31;
  }
  //System.out.println("Sunday "+g+". :"+q+"/"+m+"/2009");
  }
  }
   System.out.println("Sunday "+g+". :"+q+"/"+m+"/"+y);
  g++;
  
}
}
}
}
