
import java.io.*;
class numdate
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long n,i,j,k,l,m,n1,t;
String a[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
String s;
void input()throws IOException
{
System.out.println("Enter number:");
n=Integer.parseInt(br.readLine());
t=0;
n1=n;
j=0;
while(n1>0)
{
if(j>=4)
break;
t=(t*10)+n1%10;
j++;
n1=n1/10;
}
m=0;
while(t>0)
{
m=(m*10)+t%10;
t=t/10;
}
t=m;
System.out.println(t);
System.out.println(n1);
if(t%4==0 || t%400==0)
{
if(n1>366)
 check366(n1);
else
 check1(n1);
 }
 else
 {
 if(n1>365)
 check365(n1);
else
 check2(n1);
 }
}
void check366(long n1)
{
i=1;
k=366;
while(true)
{
if(i%2==0)
k=365;
else
k=366;
l=n1-k;
t=t+1;
i++;
if(l<365)
break;
}
datecheck(l);
}
void check365(long  n1)
{
i=1;
k=366;
while(true)
{
if(i%2==0)
k=366;
else
k=365;
l=n1-k;
t=t+1;
i++;
if(l<365)
break;
}
datecheck(l);
}
void check1(long  n1)
{
datecheck(n1);
}
void check2(long  n1)
{
datecheck(n1);
}
void datecheck(long k)
{
long i1,t1,y1,t2;
int y;
t1=0;
t2=0;
y=1;
if(t%4==0 || t%400==0)
y1=1;
else
y1=0;
for(i1=1;i1<=k;i1++)
{
t1=t1+1;
//System.out.println(t1);
if(t1>31)
{
//System.out.println("oo"+t1);
if(y==1|| y==3||y==5||y==7 ||y==8||y==10||y==12)
{
 y=y+1;
 t1=1;
 t2=t1;
 
 }
}
else
if(t1>30)
{
//System.out.println(t1);
if(y==4 || y==6||y==9||y==11)
{
 y=y+1;
 t1=1;
 t2=t1;
 
 }
}
else
if(t1>28)
{
//System.out.println(t1);
if(y==2 )
{
if(y1==0)
{
 y=y+1;
 t1=1;
 t2=t1;
 
 }
}
}
else
if(t1>29)
{
//System.out.println(t1);
if(y==2 )
{
if(y1==1)
{
 y=y+1;
 t1=1;
 t2=t1;
 
 }
}
}

}
if(t1>0)

t2=t1;
System.out.println(t2+" "+a[(int)y-1]+" "+t);
}
}



