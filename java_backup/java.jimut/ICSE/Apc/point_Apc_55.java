package Apc;
 class point_Apc_55
{
    int x,y;
    point(int a , int b)
    {
        x=a;
        y=b;
    }
    void midpoint(point p , point q)
    {
        this.x=(p.x+q.x)/2;
        this.y=(p.y+q.y)/2;
    }
    void display()
    {
        System.out.pritnln("Mid point coordinates"+x+"&"+y);
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
