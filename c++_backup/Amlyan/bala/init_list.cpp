#include<iostream>
using namespace std;

class XYZ
{
	int a,b;
	public:
		XYZ(int i, int j):a(i),b(2*j){ }
		void display();
};

void XYZ :: display()
{
	cout<<"a = "<<a<<"b = "<<b<<endl;
}

main()
{
	XYZ X(2,3);
	X.display();
	return 0;
}

