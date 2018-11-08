
class a1
{
//declaration of variable
int x;
//define the constructor
a1(int z)
{
x=z;
}
//define the display function
void disp()
{
System.out.print(x);
}
}
class b1 extends a1
{
//declaration of variable
int z;
//define the constructor
b1(int x,int z1)
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
class c1 extends b1
{
//declaration of variable
int p;
//define the constructor
c1(int x,int y,int z)
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
class inher
{
//define the function main
public static void main(String args[])
{
//defining the object of class c
c1 c11=new c1(10,20,34);
c11.disp2();
}
}