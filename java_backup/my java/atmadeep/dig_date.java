import java.io.*;
class dig_date
{
int n,n1,c,s,s1,c1,d=0,rev=0;
String m[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
void caldate()throws IOException
{
InputStreamReader reader=new InputStreamReader(System.in);
BufferedReader input=new BufferedReader(reader);
//int n,n1,c,s,s1,c1,d=0,rev=0;
//String m[]={};
System.out.println("Enter the number");
n=Integer.parseInt(input.readLine());
c=0;c1=0;s1=0;
while(n>0)
{
d=n%10;
rev=(rev*10)+d;
n1=rev;
}
while(n1>0)
{
d=n1%10;
s=(s*10)+d;
c++;
if(c>2)
{
rev(s);
c=0;
s=0;
}
n1=n1/10;
}
}
void rev(int x)
{
c1++;
s1=0;
while(x>0)
{
s1=(s1*10)+(x%10);
x=x/10;
}
System.out.print("Date:");
if(c1==1)
System.out.print(s1+" / ");
else
if(c1==2)
System.out.print(m[s1-1]+" / ");
if(c1==3)
System.out.print(s1);
if(c1>3)
c1=0;
}
}

