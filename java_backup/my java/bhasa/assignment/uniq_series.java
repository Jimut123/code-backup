package assignment;

import java.io.*;
class uniq_series
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int m,n,c,i,f1;
public static void main(String args[])throws IOException
{
uniq_series uq=new uniq_series();
uq.input();
uq.loop();
}
void input()throws IOException
{
System.out.println("ENTER UPPER LIMIT");
m=Integer.parseInt(br.readLine());
System.out.println("ENTER LOWER LIMIT");
n=Integer.parseInt(br.readLine());
System.out.println("SO , RANGE IS FROM "+n+" TO "+m);
}
void loop()
{
c=0;
for(i=n;i<=m;i++)
{
generate(i);
}
System.out.println();
System.out.println("TOTAL UNIQUE NUMBERS ="+c);
}
void generate(int x)
{
int y=x;
int f1=0;
while(y>0)
{
int k=y%10;
int y1=y;
int tempc=0;
while(y1>0)
{
int k1=y1%10;
if(k==k1)
{
tempc++;
}
y1=y1/10;
}
if(tempc>1)
{ f1=1;
break;
}
y=y/10;
}
if(f1==0)
{
c++;
System.out.print(x+",");
f1=0;
}
}
}