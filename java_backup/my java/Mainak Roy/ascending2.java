import java.util.*;
public class ascending2
{
public void a()
{
Scanner sc= new Scanner(System.in);
System.out.println("no.?");
int n=sc.nextInt();
int m=0,n1=n,t=0;
while(n1>0)
{
n1=n1/10;
t++;
}

for(int h=0;h<10;h++)
{
for(int j=1;j<=t;j++)
{
int k=0;
k=n%power(10,j);
k=k/power(10,j-1);
if(k==h)
{
m=m*10;
m=m+k;
}
}
}
System.out.println(m);
}

int power(int g,int r)
{
int p=1;
for(int j=1;j<=r;j++)
p=p*g;
return p;
}
}
