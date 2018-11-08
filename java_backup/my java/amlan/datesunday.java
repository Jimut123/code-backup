//prints sunday for 2009
import java.io.*;
class datesunday
{
public static void main(String args[])throws IOException
{
int i,j,p=0,q,m=1,g=1;
String d;
String day[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the day it was on 1/1/2009 :");
d=input.readLine();
for(i=0;i<7;i++)
{
if(d.compareTo(day[i])==0)
{
p=i;
break;
}
}
g=1;
q=0;
for(i=1;i<=365;i++)
{
q=q+1;
p=p+1;
if(p>6)
{
p=0;
if(q>28)
{
if(m==2)
{
m++;
q=q-28;
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
   System.out.println("Sunday "+g+". :"+q+"/"+m+"/2009");
  g++;
  
}
}
}
}
