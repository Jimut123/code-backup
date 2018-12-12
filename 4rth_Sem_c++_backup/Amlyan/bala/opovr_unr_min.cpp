#include<iostream>
using namespace std;

class space
{
	int x;
	int y,z;
	public:
		void getdata(int a,int b,int c);
		void display(void);
		//void operator-();
		space operator-();

};

void space::getdata(int a,int b,int c)
{
	x=a;
	y=b;
	z=c;
}

void space::display(void)
{
	cout<<x<<"\t"<<y<<"\t"<<x<<endl;
}
/**
void space::operator-()
{
	x = -x;
	y = -y;
	z = -z;
}
**/
space space::operator-()
{
	space X;	// temporary object of class space
	X.x = -x;
	X.y = -y;
	X.z = -z;
	return X;
}

int main()
{
	space S;
	S.getdata(10,-20,90);
	S.display();
	/*
	-S;
	cout<<"-S :: "<<endl;
	S.display();
	*/
	space S1 = -S;
	cout<<"S1 :: "<<endl;
	S1.display();
	return 0;
}







