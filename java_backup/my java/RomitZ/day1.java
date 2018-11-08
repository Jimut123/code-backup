import java.io.*;
class day1
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int k,i,n,p,P1,day,year;
System.out.println("Enter The Number of Day ");
day=Integer.parseInt(Input.readLine());
System.out.println("Enter The year");
year=Integer.parseInt(Input.readLine());
System.out.print("Enter The value of n");
n=Integer.parseInt(Input.readLine());
int A[]={31,28,31,30,31,30,31,31,30,31,30,31};
String b[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
if((year%4==0)&&(year%400==0))
{
A[1]=A[1]+1;
}
k=0;
for(i=0;i<12;i++)
{
if(A[i]<day)
{
p=day-A[i];
day=p;
k=i;
}
else
{
System.out.println(day+" "+b[k+1]+" "+year);
break;
}
}
p=day+100;
if(p>365)
{
year=year+1;
}
for(i=0;i<12;i++)
{
if(A[i]<day)
{
P1=day-A[i];
day=P1;
k=i;
}
else
{
System.out.println(day+" "+ k+" "+year);
break;
}
}
}
}