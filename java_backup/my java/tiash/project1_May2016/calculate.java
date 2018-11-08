package project1_May2016;

//to find the area of circle,square and rectangle
class calculate
{
    double area(double r)
    {
        return(2.14*r*r);
    }
    int area(int s)
    {
        return (s*s);
    }
    double area(double a,double b)
    {
     return(a*b);
    }
    void main()
    {
        calculate ob=new calculate();
        double p; int q;double r;
        p=ob.area(5.3);
        q=ob.area(8);
        r=ob.area(3.5,6.2);
        System.out.println("area of circle"+p);
        System.out.println("area of square"+q);
        System.out.println("area of rectangle"+r);
    }
}

        
        