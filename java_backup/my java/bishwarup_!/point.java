class point
{
int x, y;
point()
{
x=0;
y=0;
}
point(int a ,int b)
{
x=a; 
y=b;
}
void midpoint(point p,point q)
{
this.x=(p.x+q.x)/2;
this.y=(p.y+q.y)/2;
}
void display()
{
System.out.println("MID POINT COORDINATES"+x+"&"+y);
}
public static void main()
{
point ob1=new point(50,100);
point ob2=new point(10,20);
point ob3=new point();
ob3.midpoint(ob1,ob2);
ob3.display();
}
}