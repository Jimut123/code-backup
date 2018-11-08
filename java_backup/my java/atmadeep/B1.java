class B1 extends A1
{
int m,m1,m2;
B1(int m3,int m4,int m5,String name,String address,String code)
{
super(name,address,code);
m=m3;
m1=m4;
m2=m5;
}
void display()
{
super.disp1();
System.out.println(m);
System.out.println(m1);
System.out.println(m2);
}
}

