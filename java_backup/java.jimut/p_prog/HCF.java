import java.io.*;
class HCF
{
public static void main(String[]args)
{
int a=4,b=6,c=8,d=5,k;
if(a>b)
{
c=a;
d=b;
}
else
{
c=b;
d=a;
}
while(c%d!=0)
{
k=c%d;
c=d;
d=k;
}
System.out.println("HCF"+d);
}
}
