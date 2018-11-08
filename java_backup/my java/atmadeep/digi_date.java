import java.io.*;
class digi_date
{
long n,n1,s,s1,d=0,rev,c,c1;
int k;
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
rev=0;
while(n>0)
{
d=n%10;
rev=(rev*10)+d;
n=n/10;
}
n1=rev;
//System.out.println(n1);
s=0;
System.out.print("Date:");
while(n1>0)
{
d=n1%10;
s=(s*10)+d;
c++;
if(c==2)
{
calc(s);
c=0;
s=0;
}
n1=n1/10;
}
}
void calc(long x)
{
c1++;
//s1=0;
//while(x>0)
//{
//d=x%10;
//s1=(s1*10)+d;
//System.out.print(s1);
//x=x/10;
//}
if(c1==1)
System.out.print(x+"- ");
else
if(c1==2)
{
k=(int)x-1;
System.out.print(m[k]+"-");
}
if(c1==3)
{
if(x<=9)
System.out.print("0"+x);
else
System.out.print(x);
}
else
if(c1>3)
c1=0;
}
}

