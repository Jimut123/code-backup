import java.io.*;
class isomorphic
{
//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,x,m,c,k,t,n;
double p;
void input()
{

for(i=1;i<=10000;i++)
{
if(check(i)==1)
System.out.println("Isomorphic" +i);
}
}
int check(int x)
{
m=x*x;
n=m;
c=0;
while(m>0)
{
k=m%10;
c++;
m=m/10;
}
//System.out.println(c);
p=Math.pow(10,(c-1));
t=(int)p;
//n=x;
if((n%t)==x)
return 1;
else
return 0;
}
}
