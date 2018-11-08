class Souham
{
public static void main(int a)
{
int c;
c=0;
if(a<10000)
{
c=(a*10)/100;
System.out.println(c);
}
else if (a<25000)
{
c=(a*15)/100;
System.out.println(c);
}
else if(a<50000)
{
c=(a*25)/100;
System.out.println(c);
}
else
{
c=(a*30)/100;
System.out.println(c);
}
}
}