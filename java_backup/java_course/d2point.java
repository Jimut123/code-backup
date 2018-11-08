import java.io.*;
class d2point
{
    double x,y,m;
    d2point()
    {
        x=0;
        y=0;
    }
    d2point(double nx,double ny)
    {
        x=nx;
        y=ny;
    }
    d2point distance(d2point m)
    {
        d2point p=new d2point();
        p.x=(x+m.x)/2;
        p.y=(y+m.y)/2;
        return p;
    }
}
        
        