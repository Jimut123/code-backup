import java.util.*;
class bin_to_dec
{
double num;
bin_to_dec(double n)
{
num=n;
}
void cal()
{
int r=(int)num;
double r1;
double a;
double m;
double s;
double a1;
double m1;
double sum;
sum=0;
s=0;
r1=num-r;
int r2=0,cr=0,i=0;
r2=r;
while(r2>0)
{
r2=r2/10;
cr++;
}
for(i=0;i<=cr;i++)
{
a=r%10;
m=a*(Math.pow(2,i));
s=s+m;
r=r/10;
}
for(i=-1;i>=-10;i--)
{
r1=r1*10;
m1=(int)r1;
a1=m1*(Math.pow(2,i));
sum=sum+a1;
r1=r1-m1;
}
System.out.println(s+sum);
}
}
