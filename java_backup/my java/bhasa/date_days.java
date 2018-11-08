import java.io.*;
class date_days
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,a,b,c,a1,b1,c1,y,x,b2;
System.out.print("ENTER DATE ");
a=Integer.parseInt(br.readLine());
System.out.print("/");
b=Integer.parseInt(br.readLine());
System.out.print("/");
c=Integer.parseInt(br.readLine());
System.out.print("ENTER DAYS");
n=Integer.parseInt(br.readLine());
if(n>364)
{
if(c%4==0)
{
x=n%366;
}
else
x=n%365;
}
y=n-x;
c1=c+(y/365);
b2=x/30;
b1=b+b2;
if(b2+b1>12)
{
c1=c1+(b2+b1-12);
b1=b2+b1-12;
}
a1=a+(x%30);
System.out.print("DATE IS "+a1+"-"+b1+"-"+c1);
}
}
