 

class overload1
{
int a, b;
double c, d;
char e, f;
String g, h;
void sum (int x, int y)
{
int z;
a=x;
b=y;
z=a+b;
System.out.println(z);
}
void sum (double x, double y)
{
double z;
c=x;
d=y;
z=c+d;
System.out.println(z);
}
void sum (char x, char y)
{
String S="";
S=S+x+y;
System.out.println(S);
}
}