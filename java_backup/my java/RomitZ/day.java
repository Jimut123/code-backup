import java.io.*;
class day
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
int k,i,n,p,P1,day,year,d,y;
System.out.println("Enter The Number of Day ");
day=Integer.parseInt(Input.readLine());
System.out.println("Enter The year");
year=Integer.parseInt(Input.readLine());
System.out.print("Enter The value of n");
n=Integer.parseInt(Input.readLine());
int A[]={31,28,31,30,31,30,31,31,30,31,30,31};
String b[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
y=365;
if((year%4==0)&&(year%400==0))
{
A[1]=A[1]+1;
y=366;
}
k=-1;
d=day;
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
p=d+n;
if(p>y)
{
P1=y-d;
//System.out.println(P1);
d=n-P1;
//System.out.println(d);
p=d;
year=year+1;
}
day=p;
k=-1;
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
//if(k==11)
//k=11;
//else
//k=k+1;
System.out.println(day+" "+b[k+1]+" "+year);
break;
}
}
}
}