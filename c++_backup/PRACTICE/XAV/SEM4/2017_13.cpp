#include<iostream>
using namespace std;

class Shape
{
	public:
		Shape();

};

Shape :: Shape()
{
	cout<<"\n The constructor of Shape of base class created!"<<endl;
}


class Square : public Shape
{
	int size;
	public:
		Square();
		Square(int);
		void findArea();

};

Square::Square()
{
	size = 0;
	cout<<"\n Def const of Square class "<<endl;
}

Square::Square(int size)
{
	Square::size=size;
	cout<<"\n Par constructor of Shape class "<<endl;
}

void Square :: findArea()
{
	float area;
	area = size*size;
	cout<<"\n Area of square = "<<area<<endl;
}

class Circle : public Shape
{
	int rad;
	public:
		Circle();
		Circle(int);
		void findArea();
};

Circle::Circle()
{
	rad=0;
	cout<<"\n Def const of Circle class "<<endl;
}

Circle :: Circle(int rad)
{
	Circle::rad=rad;
	cout<<"\n Par const of Circle class "<<endl;
}

void Circle::findArea()
{
	float area;
	area=3.14*rad*rad;
	cout<<"\nArea of the circle = "<<area;
}

class Triangle : public Shape
{
	int base,height;
	public:
		Triangle();
		Triangle(int,int);
		void findArea();
};

Triangle :: Triangle()
{
	cout<<"\n Def const of Triangle class "<<endl;
	Triangle::base=0;
	Triangle::height=0;
}

Triangle :: Triangle(int base,int height)
{
	cout<<"\n Triangle const of Triangle class "<<endl;
	Triangle::base=base;
	Triangle::height=height;
}
void Triangle :: findArea()
{
	float area;
	area = 0.5*base*height;
	cout<<"\nArea of the Triangle "<<area<<endl;
}



int main()
{
	int s,b,h;
	cout<<"\n Enter the size of one side of  the sqaure ::"<<endl;
	cin>>s;
	Square S(s);
	S.findArea();
	cout<<"\n Enter the size of the radius of circle  ::"<<endl;
	cin>>s;
	Circle C(s);
	C.findArea();
	cout<<"\n Enter the size of the height and base of triangle ::"<<endl;
	cin>>b;
	cin>>h;
	Triangle T(b,h);
	T.findArea();
	return 0;

}
