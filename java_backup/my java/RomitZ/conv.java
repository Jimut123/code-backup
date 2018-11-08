import java.io.*;
class conv
{
int a,b,t,i;
int c[]=new int[100];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
System.out.println("Give number:");
a=Integer.parseInt(br.readLine());
if(a>999)
{
System.out.println("Not more than 3 digits...");
System.exit(0);
}
if(a<=0)
{
System.out.println("ZERO");
System.exit(0);
}
b=a;
t=0;
while(b>0)
{
c[t++]=b%10;
b=b/10;
}
cal();
//for(i=0;i<t;i++)
//System.out.println(c[i]);
}
void cal()
{
for(i=t-1;i>=0;i--)
{

if(i==1)
pos1(c[i]);
else
if(i==2)
{
pos(c[i]);
System.out.print(" "+"HUNDRED");
}
else
pos(c[i]);
}
}
void pos(int x)
{
//if(x==0)
//System.out.print("ZERO");
//else
if(x==1)
System.out.print("ONE");
else
if(x==2)
System.out.print("TWO");
else
if(x==3)
System.out.print("THREE");
else
if(x==4)
System.out.print("FOUR");
else
if(x==5)
System.out.print("FIVE");
else
if(x==6)
System.out.print("SIX");
else
if(x==7)
System.out.print("SEVEN");
else
if(x==8)
System.out.print("EIGHT");
else
if(x==9)
System.out.print("NINE");
}
void pos1(int x)
{
//if(x==0)
//System.out.print("ZERO");
//else
if(x==1)
{
if(i==1)
{
int m=c[i-1];
switch(m)
{
case 0: System.out.print("Ten");
break;
case 1: System.out.print("Eleven");
break;
case 2: System.out.print("Twelve");
break;
case 3: System.out.print("Thirteen");
break;
case 4: System.out.print("Fourteen");
break;
case 5: System.out.print("Fifteen");
break;
case 6: System.out.print("Sixteen");
break;
case 7: System.out.print("Seventeen");
break;
case 8: System.out.print("Eighteen");
break;
case 9: System.out.print("Nineteen");
break;
}
i--;
}
}
else
if(x==2)
System.out.print("Twenty");
else
if(x==3)
System.out.print("Thirty");
else
if(x==4)
System.out.print("Fourty");
else
if(x==5)
System.out.print("Fifty");
else
if(x==6)
System.out.print("Sixty");
else
if(x==7)
System.out.print("Seventy");
else
if(x==8)
System.out.print("Eighty");
else
if(x==9)
System.out.print("Ninety");
}
}
