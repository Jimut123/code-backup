package iscxi;


import java.io.*;
class datecheck
{
long num,day,month,year;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Input a 6 digit no:");
num=Long.parseLong(br.readLine());
year=num%100;
num=num/100;
month=num%100;
num=num/100;
day=num%100;
if(month==2)
{
if(year%4==0 || year%400==0)
{
if(day>29)
{
 System.out.println("Error in date.....");
 System.exit(0);
 }
 }
else
if(day>28)
{
 System.out.println("Error in date.....");
 System.exit(0);
 }
 }
 if(month==4||month==6||month==9||month==11)
 {
 if(day>30)
 {
 System.out.println("Error in date.....");
 System.exit(0);
 }
 }
daycheck(day);
monthcheck(month);
yearcheck(year);
}
void daycheck(long day)
{
long k;
if(day<1 || day >31)
{
System.out.println("Error in date");
System.exit(0);
}
k=day%10;
if(k==1)
System.out.print(day+"st");
else
if(k==2)
System.out.print(day+"nd");
else
if(k==3)
System.out.print(day+"rd");
else
System.out.print(day+"th");
}
void monthcheck(long month)
{
if(month<1 || month >12)
{
System.out.println("Error in month");
System.exit(0);
}
if(month==1)
System.out.print(" "+"January"+" ");
else
if(month==2)
System.out.print(" "+"February"+" ");
if(month==3)
System.out.print(" "+"March"+" ");
if(month==4)
System.out.print(" "+"April"+" ");
if(month==5)
System.out.print(" "+"May"+" ");
if(month==6)
System.out.print(" "+"June"+" ");
if(month==7)
System.out.print(" "+"July"+" ");
if(month==8)
System.out.print(" "+"August"+" ");
if(month==9)
System.out.print(" "+"September"+" ");
if(month==10)
System.out.print(" "+"October"+" ");
if(month==11)
System.out.print(" "+"November"+" ");
if(month==12)
System.out.print(" "+"December"+" ");
}
void yearcheck(long year)
{
System.out.print(year);
}
}