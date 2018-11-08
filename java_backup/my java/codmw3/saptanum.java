import java.util.*;
class saptanum
{
void num()
{
Scanner sc=new Scanner(System.in);
int c=0,a,m=0,n=0,d=0,b;
System.out.println("ENTER NUMBER");
a=sc.nextInt();
c=a-1;
m=2;
n=a-m;
d=a-1;
for(b=1;b<=a-1;b=b+1)
{
for(c=0;c<d;c=c+1)
{
System.out.print("1");
}
d--;
System.out.println(+b);
}
for(d=0;d<a-1;d=d+1)
{
System.out.print(+m);
if(n==0)
{
continue;
}
else{
System.out.println(+n);
}
m=m+1;
n=a-m;
}
}
}
