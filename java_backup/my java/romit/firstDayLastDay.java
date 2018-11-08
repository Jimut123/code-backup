import java.io.*;
class firstDayLastDay
{
public static void main(String args[])throws IOException
{
BufferedReader Input=new BufferedReader(new InputStreamReader(System.in));
String A[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
int i,t=0,m,y;
System.out.println("Enter The Year");
y=Integer.parseInt(Input.readLine());
System.out.println("Enter The 1st Day");
String n=Input.readLine();

for(i=0;i<7;i++)
{
if(n.compareTo(A[i])==0)
{
t=i;
break;
}
}
if((y%400==0)||(y%4==0))
{
m=366;
}
else
{
m=365;
}
for(i=1;i<m;i++)
{
t++;
if(t>=7)
{
t=0;
}
}
System.out.println("The Last Day"+A[t]);
}
}

