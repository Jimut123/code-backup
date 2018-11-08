import java.util.*;
class series
{
void ser()
{
Scanner sc=new Scanner(System.in);
int e,m=0,n=0,b,c,d,a;

System.out.println("ENTER NUMBER");
a=sc.nextInt();
e=a-1;
m=2;n=a-m;
for(b=0;b<a-1;b=b+1)
{
for(c=0;c<d;c=c+1)
{
System.out.print("1");
}
d--;
System.out.print(b);
}
for(d=0;d<a-1;d=d+1)
{
System.out.print(+m);
System.out.println(n);
m=m+1;
n=a-m;
}
}
}