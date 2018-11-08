
class a
{
//declaration of variable
int x;
//define the constructor
a(int z)
{
x=z;
}
//define the display function
void disp()
{
System.out.print(x);
}
}
class b extends a
{
//declaration of variable
int z;
//define the constructor
b(int x,int z1)
{
super(x);
z=z1;
}
//define the display function
void disp1()
{
super.disp();
System.out.print(z);
}
}
class c extends b
{
//declaration of variable
int p;
//define the constructor
c(int x,int y,int z)
{
super(x,z);
p=y;
}
//define the constructor
void disp2()
{
super.disp1();
System.out.print(p);
}
}
class inher1
{
//define the function main
public static void main(String args[])
{
//defining the object of class c
c c1=new c(10,20,34);
c1.disp2();
}
}