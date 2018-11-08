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
q=(7-p)-1;
for(i=0;i<15;i++)
{
//System.out.println(q);

if(q>31 || q>30 ||q>28)
{
q=1;
m++;
}
//else
//if(q>30)
//{
//q=q-30-1;
//m++;
//}
//else
//if(q>28)
//{
//q=q-28-1;
//m++;
//}
System.out.println("Sunday "+g+". :"+q+"/"+m+"/2009");
q=q+7;
g++;
}
}
}