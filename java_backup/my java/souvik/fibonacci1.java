
class fibonacci1
{


public static void main(String args[])
{
int a,b,c,s,i;
a=1;
b=1;
s=0;
for (i=1;i<+20-2;i++)
{
c=a+b;
s=s+c;
a=b;
b=c;

System.out.println(s);
}
}
}