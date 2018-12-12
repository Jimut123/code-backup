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
		//space operator-();
		friend void operator-(space &s);

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
/**
space space::operator-()
{
	space X;	// temporary object space
	X.x = -x;
	X.y = -y;
	X.z = -z;
	return X;
}
**/
void operator-(space & obj)
{	
	obj.x = -obj.x;
	obj.y = -obj.y;
	obj.z = -obj.z;
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
	/**space S1 = -S;
	cout<<"S1 :: "<<endl;
	S1.display();
	**/
	-S;
	S.display();
	return 0;
}







