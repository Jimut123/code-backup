class C1 extends B1
{
int discount;
C1(int d1,String name,String address,String code,int m,int m1,int m2)
{
super(m,m1,m2,name,address,code);
discount=d1;
}
void display()
{
super.display();
System.out.println(discount);
}
}

