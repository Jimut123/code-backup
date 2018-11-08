
class a
{
int x;
a(int z)
{
x=z;
}
void disp()
{
System.out.print(x);
}
}
class b extends a
{
int z;
b(int x,int z1)
{
super(x);
z=z1;
}
void disp1()
{
super.disp();
System.out.print(z);
}
}
class c extends b
{
int p;
b(int x,int y,int z)
{
super(x,z);
p=y;
}
void disp2()
{
super.disp1();
System.out.print(p);
}
}
class inherit_constructor
{
public static void main(String args[])
{
c c1=new c(10,20,34);
c1.disp2();
}
}