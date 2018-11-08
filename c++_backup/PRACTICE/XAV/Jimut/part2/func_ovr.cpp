#include<iostream>
using namespace std;

class Shape
{
	public:
		void area(int len);
		void area(float rad);
		void area(int len,int bd);
		void area(float base,float height);
};

void Shape::area(int len)
{
	// Area of a square
	cout<<"Area of the square :: "<<len*len<<endl;
}
void Shape::area(float rad)
{
	cout<<"Area of the circle :: "<<3.14*rad*rad<<endl;
}
void Shape::area(int len,int bd)
{
	cout<<"Area of the rectangle :: "<<len*bd<<endl;
}
void Shape::area(float base,float height)
{
	 cout<<"Area of the triangle :: "<<0.5*base*height<<endl;
}


int main()
{
	Shape S;
	int len_s,len_r,bd_r;
	float rad,base,height;
	cout<<"\nEnter the length of the side of the square : "<<endl;
	cin>>len_s;
	S.area(len_s);
	cout<<"\nEnter the radius of circle : "<<endl;
        cin>>rad;
	S.area(rad);
	cout<<"\nEnter the length and breadth of the rectangle : "<<endl;
        cin>>len_r>>bd_r;
	S.area(len_r,bd_r);
	cout<<"\nEnter the base and height of the triangle : "<<endl;
        cin>>base>>height;
	S.area(base,height);
	return 0;
}






