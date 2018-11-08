#include<iostream>
using namespace std;

class B;	//forward declaration

class A
{
	int x;
	public:
		void getinput(int i);
		void disp();
		friend void exc(A &,B &);
		
};

void A::disp()
{
	cout<<"The value of class A's x "<<x<<endl;
}

void A::getinput(int i)
{
	x=i;
}

class B
{
	int y;
	public:
		void getinput(int i);
		void disp();
		friend void exc(A &,B &);
};

void B::disp()
{
	cout<<"The value of class B's y "<<y<<endl;
}

void B::getinput(int i)
{
	y=i;
}

void exc(A & obj1,B & obj2)
{
	int t;
	t = obj2.y;
	obj2.y = obj1.x;
	obj1.x = t;
}


int main()
{
	A a;
	B b;
	int n1,n2;
	cout<<"\n Enter the two numbers ::"<<endl;
	cin>>n1>>n2;
	a.getinput(n1);
	b.getinput(n2);
	a.disp();
	b.disp();
	cout<<"\n After exchanging the private data members we get :: "<<endl;
	exc(a,b);
	a.disp();
	b.disp();
	return 0;
}



